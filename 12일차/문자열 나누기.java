class Solution {
    public int solution(String s) {
        int answer = 0;
        int c_count = 0; // 목표되는 c의 개수
        int o_count = 0; // 그 이외의 개수
        char c = s.charAt(0); // 목표가 되는 c
        for(int i = 0; i < s.length(); i++){ // 한 자리면 i = 1이 될 수 없다. 
            if(c_count == 0) c = s.charAt(i);
            if(s.charAt(i) == c) c_count++;
            else o_count++;
            if(c_count == o_count){
                c_count = 0;
                o_count = 0;
                answer++;
            }
            if(i == s.length() - 1 && c_count != o_count){
                answer++;
                break;
            }
        }
        return answer;
    }
}
//
class Solution {
    public int solution(String s) {
        int answer = 0;
        int c_count = 1; // 목표되는 c의 개수
        int o_count = 0; // 그 이외의 개수
        char c = s.charAt(0); // 목표가 되는 c
        if(s.length() == 1) return 1;
        for(int i = 1; i < s.length(); i++){ // 한 자리면 i = 1이 될 수 없다. 
            if(c_count == 0) c = s.charAt(i);
            if(s.charAt(i) == c) c_count++;
            else o_count++;
            if(c_count == o_count){
                c_count = 0;
                o_count = 0;
                answer++;
            }
            if(i == s.length() - 1 && c_count != o_count){
                answer++;
                break;
            }
        }
        return answer;
    }
}
