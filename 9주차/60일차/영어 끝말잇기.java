import java.util.Stack;
class Solution {
    public int[] solution(int n, String[] words) {
        String temp = "";
        int[] answer = new int[2];
        Stack<String> st = new Stack<>();
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(!st.isEmpty()) temp = st.peek();
            if(st.contains(word)){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            st.push(word);
            if(i > 0 && temp.charAt(temp.length() - 1) != word.charAt(0)){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }
        return answer;
    }
}
