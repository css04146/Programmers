class Solution {
    int answer = 0;
    boolean[] visit; // 방문 여부
    public int solution(int[] number) {
        int len = number.length;
        visit = new boolean[len];
        dfs(0, number);
        return answer;
    }
    public void dfs(int start, int[] number){
        int sum = 0; // 합계
        int idx = 0; // true의 개수
        for(int i = 0; i < number.length; i++){
            if(visit[i]){
                sum += number[i];
                idx++;
            }
        }
        if(sum == 0 && idx == 3) answer++;
        for(int i = start; i < number.length; i++){
            visit[i] = true; // 방문 여부가 처음에는 false로 초기화되기 때문에 true로 선언해야 한다.
            dfs(i + 1, number);
            visit[i] = false;
        }
    }
}
