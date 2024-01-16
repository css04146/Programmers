// 시간 초과
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            int[] temp = Arrays.copyOfRange(numbers, i + 1, len);
            for(int j = 0; j < temp.length; j++){
                if(numbers[i] < temp[j]){
                    answer[i] = temp[j];
                    break;
                }
            }
            answer[i] = answer[i] == 0 ? -1 : answer[i];
        }
        return answer;
    }
}
//
import java.util.Stack;
class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < len; i++){
            while(!st.isEmpty() && numbers[st.peek()] < numbers[i]){
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
