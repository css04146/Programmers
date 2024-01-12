class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        for(int s : section){
            if(s >= start){
                start = s;
                start += m;
                answer++;
            }
        }
        return answer;
    }
}
