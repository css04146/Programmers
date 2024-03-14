class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i++){
            answer[i] = x * (long)(i + 1);
        }
        return answer;
    }
}
/* 파이썬
def solution(x, n):
    return list(i * x for i in range(1, n + 1))
*/
