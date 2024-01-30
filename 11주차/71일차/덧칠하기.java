class Solution {
    public int solution(int n, int m, int[] section) {
        int start = 0;
        int answer = 0;
        for(int s : section){
            start = start < s ? s : start;
            if(start > s) continue;
            start += m;
            answer++;
            if(start > n) break;
        }
        return answer;
    }
}
