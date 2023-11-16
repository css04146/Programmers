// https://school.programmers.co.kr/learn/courses/30/lessons/87390
// 무조건 복습 필요
class Solution {
    public int[] solution(int n, long left, long right) {
        int tleft = (int)left;
        int tright = (int)right;
        int[] answer = new int[tright - tleft + 1];
        for(int i = 0; i < answer.length; i++){
            long temp = left + i;
            long value = Math.max(temp / n + 1, temp % n + 1);
            answer[i] = (int)value;
        }
        return answer;
    }
}
