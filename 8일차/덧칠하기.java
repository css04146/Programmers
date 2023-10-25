// 복습
class Solution {
    public int solution(int n, int m, int[] section) {
        int sum = 0;
        int answer = 0;
        for(int s : section){
            if(s < sum) continue;
            sum = s + m;
            answer++;
        }
        return answer;
    }
}
