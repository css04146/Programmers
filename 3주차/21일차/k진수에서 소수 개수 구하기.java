// 복습 요. (long 변환 때문에)
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String temp = Integer.toString(n, k);
        String[] str = temp.split("0");
        for(String s : str){
            if(s.equals("")) continue;
            long i = Long.parseLong(s);
            if(i == 1) continue;
            if(isPrime(i)) answer++;
        }
        return answer;
    }
    boolean isPrime(long n){
        int sqrt = (int)Math.sqrt(n);
        if(Math.sqrt(n) == sqrt) return false;
        for(int i = 2; i <= sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
