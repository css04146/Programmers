import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(st.isEmpty()) st.push(i);
            else if(st.peek() != i){
                list.add(st.pop());
                st.push(i);
            }
        }
        list.add(arr[arr.length - 1]);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}
