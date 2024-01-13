class Solution {
    public String solution(String s) {
        int index = 0;
        String answer = "";
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            answer += index == 0 ? Character.toUpperCase(c) : c;
            index = c == ' ' ? 0 : index + 1;
        }
        return answer;
    }
}
