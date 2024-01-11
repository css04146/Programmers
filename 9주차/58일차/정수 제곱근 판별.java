class Solution {
    public long solution(long n) {
        long answer = (long)Math.sqrt(n);
        return Math.sqrt(n) == answer ? (long)Math.pow(answer + 1, 2) : -1;
    }
}
