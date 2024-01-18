class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.append(n % k);
            n /= k;
        }
        String s = sb.reverse().toString();
        String[] temp = s.split("0");
        for(String t : temp) if(!t.equals("") && isPrime(t)) answer++;
        return answer;
    }
    public boolean isPrime(String s){
        long n = Long.parseLong(s);
        if(n == 1) return false;
        if(n == 2) return true;
        double sqrt = Math.sqrt(n);
        if(sqrt == (int)sqrt) return false;
        for(int i = 2; i <= (int)sqrt; i++) if(n % i == 0) return false;
        return true;
    }
}
