class Solution {
    public int solution(int n) {
        int answer = n;
        for(int i = 1; i <= n / 2; i++){
            answer += n % i == 0 ? i : 0;
        }
        return answer;
    }
}
