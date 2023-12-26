class Solution {
    public int solution(int n) {
        int answer = 1;
        if(n == 1) return 1;
        if(n == 2) return 1;
        for(int i = 1; i <= n / 2 + 1; i++){
            int sum = 0;
            for(int j = i; j <= n; j++){
                sum += j;
                if(sum == n){
                    answer++;
                    break;
                }
                else if(sum > n) break;
            }
        }
        return answer;
    }
}
