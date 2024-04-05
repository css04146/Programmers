// 정답 코드
import java.util.Stack;
class Solution {
    public String solution(String p) {
        if(check(p)) return p;
        return makeP(p);
    }
    public String makeP(String p){
        int idx = 0;
        int count1 = 0;
        int count2 = 0;
        if(p.equals("")) return p;
        StringBuilder sb = new StringBuilder();
        while(true){
            if(count1 != 0
            && count2 != 0
            && count1 == count2) break;
            if(p.charAt(idx) == '(') count1++;
            else count2++;
            idx++;
        }
        String temp1 = p.substring(0, idx);
        String temp2 = p.substring(idx);
        for(int i = 1; i < idx - 1; i++){
            if(p.charAt(i) == '(') sb.append(')');
            else sb.append('(');
        }
        if(check(temp1)) return temp1 + makeP(temp2);
        return "(" + makeP(temp2) + ")" + sb.toString();
    }
    public boolean check(String p){
        Stack<Character> st = new Stack<>();
        for(char c : p.toCharArray()){
            if(!st.isEmpty()){
                if(st.peek() == '('
                && c == ')') st.pop();
                else st.push(c);
            } else st.push(c);
        }
        return st.isEmpty();
    }
}
