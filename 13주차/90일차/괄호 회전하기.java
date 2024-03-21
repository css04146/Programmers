import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            s = s.substring(1) + s.charAt(0);
            Stack<Character> st = new Stack<>();
            for(char c : s.toCharArray()){
                if(!st.isEmpty()){
                    if(c == ')' && st.peek() == '(') st.pop();
                    else if(c == ']' && st.peek() == '[') st.pop();
                    else if(c == '}' && st.peek() == '{') st.pop();
                    else st.push(c);
                } else st.push(c);
            }
            if(st.isEmpty()) answer += 1;
        }
        return answer;
    }
}
