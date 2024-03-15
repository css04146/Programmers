class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int sum = 0;
            for(int j = i; j <= n; j++){
                sum += j;
                if(n == sum){
                    answer++;
                    break;
                }
                else if(sum > n) break;
            }
        }
        return answer;
    }
}
/* 파이썬
  def solution(n):
    answer = 0
    for i in range(1, n + 1):
        sum = 0
        for j in range(i, n + 1):
            sum += j
            if sum == n:
                answer += 1
                break
            elif sum > n:
                break
    return answer
*/
