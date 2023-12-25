import java.util.Arrays;
class Solution {
    public int solution(int x, int y, int n) {
        int[] answer = new int[y + 1];
        Arrays.fill(answer, y + 1);
        answer[x] = 0;
        for(int i = x; i <= y; i++){
            if(i + n <= y) answer[i + n] = Math.min(answer[i + n], answer[i] + 1);
            if(i * 2 <= y) answer[i * 2] = Math.min(answer[i * 2], answer[i] + 1);
            if(i * 3 <= y) answer[i * 3] = Math.min(answer[i * 3], answer[i] + 1);
        }
        return answer[y] == y + 1 ? -1 : answer[y];
    }
}
