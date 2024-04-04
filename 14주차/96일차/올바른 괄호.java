import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty()){
                if(c == ')'){
                    if(st.peek() == '(') st.pop();
                } else st.push(c);
            } else st.push(c);
        }
        return st.isEmpty() ? true : false;
    }
}
