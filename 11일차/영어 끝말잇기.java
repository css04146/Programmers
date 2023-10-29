// 복습
import java.util.Set;
import java.util.Stack;
import java.util.HashSet;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Stack<String> st = new Stack<>();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(set.contains(word)){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                return answer;
            }
            if(!st.isEmpty()){
                String temp = st.pop();
                int tlen = temp.length() - 1;
                int wlen = word.length() - 1;
                if(temp.charAt(tlen) != word.charAt(0)){
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    return answer;
                }
            }
            st.push(word);
            set.add(word);
        }
        return answer;
    }
}
