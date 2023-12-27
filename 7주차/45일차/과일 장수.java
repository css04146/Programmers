import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int len = score.length;
        for(int i = len % m; i < len; i += m){
            answer += score[i] * m;
        }
        return answer;
    }
}
