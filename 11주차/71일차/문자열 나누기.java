class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        int o_count = 0;
        int start = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            if(count == 0) start = s.charAt(i);
            count = s.charAt(i) == start ? count + 1 : count;
            o_count = s.charAt(i) != start ? o_count + 1 : o_count;
            if(o_count == count){
                answer++;
                count = 0;
                o_count = 0;
            }
            else{
                if(i == s.length() - 1) answer++;
            }
        }
        return answer;
    }
}
