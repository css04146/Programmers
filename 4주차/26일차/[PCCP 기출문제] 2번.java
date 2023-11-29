import java.util.Queue;
import java.util.LinkedList;
class Solution {
    int[] fuel;
    int answer = 0;
    int width = -1;
    int height = -1;
    boolean[][] visit;
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    public int solution(int[][] land) {
        height = land.length;
        width = land[0].length;
        fuel = new int[width];
        visit = new boolean[height][width];
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                if(land[j][i] == 1 && !visit[j][i]){ // &&과 || 주의, 방
                    bfs(i, j, land);
                }
            }
        }
        return answer;
    }
    public void bfs(int x, int y, int[][] land){
        boolean[] visitX = new boolean[width];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visit[y][x] = true;
        visitX[x] = true;
        int total = 1;
        while(!q.isEmpty()){
            int[] temp = q.poll();
            for(int i = 0; i < 4; i++){
                int cx = temp[0] + dx[i];
                int cy = temp[1] + dy[i];
                if(cx < 0 || cx >= width
                || cy < 0 || cy >= height) continue;
                if(land[cy][cx] == 0 || visit[cy][cx]) continue;
                visit[cy][cx] = true;
                visitX[cx] = true;
                total++;
                q.add(new int[]{cx, cy});
            }
        }
        for(int i = 0; i < width; i++){
            if(visitX[i]){
                fuel[i] += total;
                answer = Math.max(fuel[i], answer);
            }
        }
    }
}
