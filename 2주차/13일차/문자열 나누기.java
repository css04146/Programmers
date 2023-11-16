class Solution {
    public int solution(String s) {
        int answer = 0;
        int c_count = 1;
        int o_count = 0;
        char c = s.charAt(0);
        if(s.length() == 1) return 1;
        for(int i = 1; i < s.length(); i++){
            if(c_count == 0) c = s.charAt(i);
            if(c == s.charAt(i)) c_count++;
            if(c != s.charAt(i)) o_count++;
            if(c_count == o_count){
                answer++;
                c_count = 0;
                o_count = 0;
            }
            if(i == s.length() - 1 && c_count != o_count) answer++;
        }
        return answer;
    }
}
