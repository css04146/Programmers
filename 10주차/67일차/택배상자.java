import java.util.Stack;
class Solution {
    public int solution(int[] order) {
        int idx = 0;
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 1; i <= order.length; i++){
            st.push(i);
            while(!st.isEmpty() && st.peek() == order[idx]){
                if(st.peek() == order[idx]){
                    st.pop();
                    answer++;
                    idx++;
                }
            }
        }
        return answer;
    }
}
