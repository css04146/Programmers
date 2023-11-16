// 실패, 가까운 시일 내에 다시 하기
import java.util.Stack;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String[] solution(String[][] plans) {
        trans(plans); // plans 정리
        int index = 0; // answer의 순서
        int minute = -1; // 과제 진행시간
        Stack<String[]> st = new Stack<>();
        Stack<String[]> tst = new Stack<>(); // stack 안의 내용 변경용
        String[] answer = new String[plans.length];
        Arrays.sort(plans, new Comparator<String[]>(){
            public int compare(String[] s1, String[] s2){
                if(toi(s1[1]) < toi(s2[1])) return -1;
                else if(toi(s1[1]) == toi(s2[1])) return 0;
                else return 1;
            }
        });
        for(String[] plan : plans){
            if(st.isEmpty()) st.push(plan);
            else{
                int top = st.size() - 1;
                int size = st.size() - 2;
                int time = toi(plan[2]) - toi(stgm(st, top));
                while(size --> 0){
                    if(stgt(st, size) + stgt(st, size) <= stgt(st, top)){
                        answer[index++] = st.pop()[0];
                        break;
                    }
                }
                String now = plan[1];
                int time = toi(plan[2]);
            }
        }
        return answer;
    }
    public int stgt(Stack<String[]> st, int n){ // Stack의 시간 출력
        return Integer.parseInt(st.get(n)[1]);
    }
    public int stgm(Stack<String[]> st, int n){ // Stack의 분 출력
        return Integer.parseInt(st.get(n)[2]);
    }
    public int toi(String s){ // 정수형 변환
        return Integer.parseInt(s);
    }
    public String[][] trans(String[][] s){ // plans의 2번째 변환
        for(String[] str : s){
            String[] temp = str[1].split(":");
            int hour = Integer.parseInt(temp[0]);
            int min = Integer.parseInt(temp[1]);
            int now = hour * 60 + min;
            str[1] = String.valueOf(now);
        }
        return s;
    }
}
