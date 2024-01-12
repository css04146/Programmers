class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int len = score.length;
        java.util.Arrays.sort(score);
        for(int i = len % m; i < len; i += m){
            answer += score[i] * m;
        }
        return answer;
    }
}
