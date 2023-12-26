import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(') st.push(c);
            else if(!st.isEmpty() && c == ')'){
                if(st.peek() == '(') st.pop(); // string이 char에 비해 느리고, string은 equals이다.
                else return false;
            }
            else return false;
        }
        return st.isEmpty();
    }
}
//
import java.util.Stack;
class Solution {
    boolean solution(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') count++;
            else if(s.charAt(i) == ')') count--;
            if(count < 0) return false;
        }
        return count == 0 ? true : false;
    }
}
