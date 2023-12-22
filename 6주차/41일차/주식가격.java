// 복습 요
import java.util.Stack;
class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] answer = new int[prices.length];
        for(int i = 0; i < prices.length; i++){
            while(!st.isEmpty() && prices[st.peek()] > prices[i]){
                answer[st.peek()] = i - st.pop();
            }
            st.push(i);
        }
        int len = prices.length;
        while(!st.isEmpty()){
            answer[st.peek()] = len - st.pop() - 1;
        }
        return answer;
    }
}
