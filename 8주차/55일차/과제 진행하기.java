// 복습 요망
import java.util.List;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public String[] solution(String[][] plans) {
        trans_plan(plans);
        array_sort(plans);
        Stack<String[]> st = new Stack<>();
        List<String> list = new ArrayList<>();
        for(String[] plan : plans){
            if(!st.isEmpty()){
                int time = toi(plan[1]) - toi(st.peek()[1]);
                while(time >= 0 && !st.isEmpty()){
                    if(toi(st.peek()[2]) <= time){
                        list.add(st.peek()[0]);
                        time -= toi(st.pop()[2]);
                    }
                    else{
                        String[] temp = st.pop();
                        temp[2] = tos(toi(temp[2]) - time);
                        st.push(temp);
                        break;
                    }
                }
                st.push(plan);
            }
            else st.push(plan);
        }
        while(!st.isEmpty()) list.add(st.pop()[0]);
        return list.toArray(new String[0]);
    }
    public String[][] array_sort(String[][] plans){
        Arrays.sort(plans, new Comparator<String[]>(){
            public int compare(String[] s1, String[] s2){
                if(toi(s1[1]) < toi(s2[1])) return -1;
                else if(toi(s1[1]) > toi(s2[1])) return 1;
                else return 0;
            }
        });
        return plans;
    }
    public String[][] trans_plan(String[][] plans){
        for(String[] plan : plans){
            String[] temp = plan[1].split(":");
            int hour = toi(temp[0]);
            int minute = toi(temp[1]);
            plan[1] = tos(hour * 60 + minute);
        }
        return plans;
    }
    public String tos(int n){
        return String.valueOf(n);
    }
    public int toi(String s){
        return Integer.parseInt(s);
    }
}
