// 복습
import java.util.Stack;
import java.util.Arrays;
class Solution {
    public String[] solution(String[][] plans) {
        int index = 0;
        restruct(plans);
        arraysort(plans);
        int len = plans.length;
        String[] answer = new String[len];
        Stack<String[]> st = new Stack<>();
        for(String[] plan : plans){
            if(!st.isEmpty()){
                int min = toi(plan[1]) - toi(st.peek()[1]); // 남은 시간
                while(!st.isEmpty() && min > 0){
                    if(min >= toi(st.peek()[2])){ // 시간이 된다면
                        answer[index++] = st.peek()[0];
                        min -= toi(st.pop()[2]);
                    }
                    else{
                        String[] temp = st.pop();
                        int value = toi(temp[2]);
                        temp[2] = String.valueOf(value - min);
                        st.push(temp);
                        break;
                    }
                }
                st.push(plan);
            }
            else st.push(plan);
        }
        while(!st.isEmpty()) answer[index++] = st.pop()[0];
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
