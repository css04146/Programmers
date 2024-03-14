class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) if(n % i == 0) answer += i;
        return answer;
    }
}
/* 파이썬
def solution(n):
    return sum(i for i in range(1, n + 1) if n % i == 0)

def solution(n):
    return sum(filter(lambda x : n % x == 0, range(1, n + 1)))
*/
