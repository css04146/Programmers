// 복습 요망
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        for(int i = min(a, b); i <= max(a, b); i++) answer += i;
        return answer;
    }
    public int min(int a, int b){
        return Math.min(a, b);
    }
    public int max(int a, int b){
        return Math.max(a, b);
    }
}
