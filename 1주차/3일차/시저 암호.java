class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c : s.toCharArray()){
            c = c == ' ' ? c : c >= 'a' ?
            (char)((c - 'a' + n) % 26 + 'a') :
            (char)((c - 'A' + n) % 26 + 'A');
            answer += c;
        }
        return answer;
    }
}
