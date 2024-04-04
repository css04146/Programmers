// 실패 코드 모음
import java.util.Stack;
class Solution {
    public String solution(String p) {
        String answer = "";
        if(!check(p)){
            return makeP(p);
        } else return p;
    }
    public String makeP(String p){
        String temp = "";
        int idx = 0; // 비교할 인덱스
        int count = 0; // 괄호의 개수
        if(check(p)) return p;
        if(p.equals("")) return p; // 빈 문자열이면 리턴 
        while(p.charAt(0) == p.charAt(idx)){
            count++;
            idx++;
        }
        for(int i = 0; i < count; i++) temp = "(" + temp + ")";
        return temp + makeP(p.substring(idx * 2));
    }
    public boolean check(String p){
        Stack<Character> st = new Stack<>();
        for(char c : p.toCharArray()){
            if(!st.isEmpty()){
                if(c == ')' && st.peek() == '(') st.pop();
                else st.push(c);
            } else st.push(c);
        }
        return st.isEmpty();
    }
}
/**********************************************************/
import java.util.Stack;
class Solution {
    public String solution(String p) {
        String answer = "";
        if(!check(p)){
            return makeP(p);
        } else return p;
    }
    public String makeS(String p){
        String temp = "";
        char c = p.charAt(0);
        if(c == ')'){
            for(char i : p.toCharArray()){
                if(i == ')') temp += "(";
                else temp += ")";
            }
        } else return p;
        return temp;
    }
    public String makeP(String p){
        int in = 0;
        int out = 0;
        int idx = 0;
        while(in != 0 && out != 0
        && in == out){
            if(p.charAt(idx) == '(') in++;
            else out++;
        }
        return makeS(p.substring(0, idx)) + makeS(p.substring(idx));
    }
    public boolean check(String p){
        Stack<Character> st = new Stack<>();
        for(char c : p.toCharArray()){
            if(!st.isEmpty()){
                if(c == ')' && st.peek() == '(') st.pop();
                else st.push(c);
            } else st.push(c);
        }
        return st.isEmpty();
    }
}
