class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            if(evenDivisor(i)) answer += i;
            else answer -= i;
        }
        return answer;
    }
    public boolean evenDivisor(int n){
        int count = 0;
        for(int i = 1; i <= n; i++) if(n % i == 0) count++;
        return count % 2 == 0 ? true : false;
    }
}
