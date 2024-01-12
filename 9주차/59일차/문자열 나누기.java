class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        int o_count = 0;
        char c = s.charAt(0);
        for(char i : s.toCharArray()){
            if(count == o_count){
                count = 0;
                o_count = 0;
                answer++;
                c = i;
            }
            if(i == c) count++;
            else if(i != c) o_count++;
        }
        return answer;
    }
}
