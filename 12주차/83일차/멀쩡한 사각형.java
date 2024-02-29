// 복습 요망
class Solution {
    public long solution(int w, int h) {
        long gcd = gcd(w, h);
        long answer = (long)w * h - ((w / gcd) + (h / gcd) - 1) * gcd;
        return answer;
    }
    public int gcd(int w, int h){
        int r = w % h;
        if(r == 0) return h;
        return gcd(h, r);
    }
}
