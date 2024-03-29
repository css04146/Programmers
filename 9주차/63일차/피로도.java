class Solution {
    int answer = 0;
    boolean[] visit;
    public int solution(int k, int[][] dungeons) {
        int len = dungeons.length;
        visit = new boolean[len];
        dungeons(0, k, dungeons);
        return answer;
    }
    public void dungeons(int depth, int k, int[][] dungeons){
        for(int i = 0; i < dungeons.length; i++){
            if(!visit[i] && k >= dungeons[i][0]){
                visit[i] = true;
                dungeons(depth + 1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}
