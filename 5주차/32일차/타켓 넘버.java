class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target);
        return answer;
    }
    public void dfs(int depth, int[] numbers, int target){
        if(depth == numbers.length && target == 0) answer++;
        if(depth < numbers.length){
            dfs(depth + 1, numbers, target - numbers[depth]);
            dfs(depth + 1, numbers, target + numbers[depth]);
        }
    }
}
