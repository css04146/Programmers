class Solution {
    int answer = 0;
    boolean[] visit;
    public int solution(int k, int[][] dungeons) {
        int len = dungeons.length;
        visit = new boolean[len];
        dfs(k, dungeons, 0);
        return answer;
    }
    void dfs(int k, int[][] dungeons, int cnt){
        for(int i = 0; i < dungeons.length; i++){
            if(k >= dungeons[i][0] && !visit[i]){
                visit[i] = true;
                dfs(k - dungeons[i][1], dungeons, cnt + 1);
                visit[i] = false;
            }
        }
        answer = Math.max(answer, cnt);
    }
}
