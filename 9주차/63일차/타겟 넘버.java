class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target);
        return answer;
    }
    public void dfs(int depth, int[] numbers, int now){
        int len = numbers.length;
        if(depth == len){
            if(now == 0) answer++;
            return;
        }
        dfs(depth + 1, numbers, now - numbers[depth]);
        dfs(depth + 1, numbers, now + numbers[depth]);
    }
}
