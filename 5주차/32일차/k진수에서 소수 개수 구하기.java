class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String temp = Integer.toString(n, k);
        String[] s = temp.split("0");
        for(int i = 0; i < s.length; i++){
            if(s[i].equals("")) continue;
            if(isPrime(s[i])) answer++;
        }
        return answer;
    }
    public boolean isPrime(String s){
        long n = Long.parseLong(s);
        if(n == 1) return false;
        double sqrt = Math.sqrt(n);
        for(int i = 2; i <= (int)sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
