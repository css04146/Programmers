class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) if(isPrime(i)) answer++;
        return answer;
    }
    public boolean isPrime(int n){
        double sqrt = Math.sqrt(n);
        if((int)sqrt == sqrt) return false;
        for(int i = 2; i <= (int)sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
