import java.util.Stack;
class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < len; i++){
            while(!st.isEmpty() && prices[st.peek()] > prices[i]){
                answer[st.peek()] = i - st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            answer[st.peek()] = len - st.pop() - 1;
        }
        return answer;
    }
}
