// 결국 풀어냄
import java.util.Stack;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
class Solution {
    public String[] solution(String[][] plans) {
        trans(plans); // plan[i][1]의 형 변환
        asort(plans); // plan을 시간 순서로 정렬
        int index = 0; // answer의 index
        String[] answer = new String[plans.length];
        Stack<String[]> st = new Stack<>();
        for(String[] plan : plans){
            if(!st.isEmpty()){
                int min = tint(plan[1]) - tint(st.peek()[1]); // 과제 가능 시간
                while(!st.isEmpty() && min >= 0){ 
                // 과제 가능 시간이 0보다 클 때만 반복
                    if(min >= tint(st.peek()[2])){ // stack 내의 과제 시간
                        min -= tint(st.peek()[2]);
                        answer[index++] = st.pop()[0];
                    }
                    else{ // 남은 시간이 st내의 과제 시간보다 적다면 
                        String[] temp = st.pop();
                        int tem = tint(temp[2]); // st내 과제의 남은 시간
                        tem -= min; // 과제 시간에서 min을 빼준다.
                        temp[2] = String.valueOf(tem);
                        st.push(temp); // 정리하고 다시 st에 넣는다
                        break; // 이미 st내 과제를 하는 것이 불가능하므로 while문 종료
                    }
                }
                st.push(plan); // 다 완료하고 현재 과제를 st에 집어넣는다.
            }
            else st.push(plan);
        }
        while(!st.isEmpty()) answer[index++] = st.pop()[0];
        return answer;
    }

    public void trans(String[][] plans){
        for(String[] plan : plans){
            String[] temp = plan[1].split(":");
            int hour = Integer.parseInt(temp[0]);
            int min = Integer.parseInt(temp[1]);
            plan[1] = String.valueOf(hour * 60 + min);
        }
    }

    public void asort(String[][] plans){
        Arrays.sort(plans, new Comparator<String[]>(){
            public int compare(String[] s1, String[] s2){
                if(tint(s1[1]) < tint(s2[1])) return -1;
                else if(tint(s1[1]) == tint(s2[1])) return 0;
                else return 1;
            }
        });
    }

    public int tint(String s){
        return Integer.parseInt(s);
    }
}
