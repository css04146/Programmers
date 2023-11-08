// 복습 요
import java.util.Stack;
import java.util.Arrays;
class Solution {
    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        int idx = 0; // result의 순서
        restruct(plans); // 재구조화
        arraysort(plans); // plans 재정렬
        Stack<String[]> st = new Stack<>();
        for(String[] plan : plans){
            if(!st.isEmpty()){
                int remain = toi(plan[1]) - toi(st.peek()[1]);
                while(!st.isEmpty() && remain > 0){
                    if(toi(st.peek()[2]) <= remain){
                        answer[idx++] = st.peek()[0];
                        remain -= toi(st.pop()[2]);
                    }
                    else{
                        String[] temp = st.pop();
                        int value = Integer.parseInt(temp[2]);
                        temp[2] = String.valueOf(value - remain);
                        st.push(temp);
                        break;
                    }
                }
                st.push(plan);
            }
            else st.push(plan);
        }
        while(!st.isEmpty()) answer[idx++] = st.pop()[0];
        return answer;
    }
    public void restruct(String[][] plans){
        for(String[] plan : plans){
            String[] temp = plan[1].split(":");
            int hour = Integer.parseInt(temp[0]);
            int min = Integer.parseInt(temp[1]);
            plan[1] = String.valueOf(hour * 60 + min);
        }
    }
    public void arraysort(String[][] plans){
        Arrays.sort(plans, (o1, o2) -> {
            if(toi(o1[1]) < toi(o2[1])) return -1;
            else if(toi(o1[1]) == toi(o2[1])) return 0;
            else return 1;
        });
    }
    public int toi(String s){
        return Integer.parseInt(s);
    }
}
