class Solution {
    public long solution(long n) {
        int sqrt = (int)Math.sqrt(n);
        return isPow(n) ? (long)Math.pow(sqrt + 1, 2) : -1;
    }
    public boolean isPow(long n){
        double sqrt = Math.sqrt(n);
        if(sqrt == (int)sqrt) return true;
        return false;
    }
}
