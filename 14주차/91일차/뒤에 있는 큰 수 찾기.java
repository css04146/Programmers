import java.util.Stack;
class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> st = new Stack<>();
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            while(!st.isEmpty() && numbers[i] > numbers[st.peek()]){
                answer[st.pop()] = numbers[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            answer[st.pop()] = -1;
        }
        return answer;
    }
}
