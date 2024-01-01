import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int[][] maps) {
        int x = 0, y = 0;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int height = maps.length;
        int width = maps[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        while(!q.isEmpty()){
            int[] temp = q.poll();
            x = temp[0];
            y = temp[1];
            for(int i = 0; i < 4; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                if(cx < 0 || cx >= width
                || cy < 0 || cy >= height) continue;
                if(maps[cy][cx] == 1){
                    maps[cy][cx] += maps[y][x];
                    q.add(new int[]{cx, cy});
                }
            }
        }
        int answer = maps[height - 1][width - 1];
        return answer == 1 ? -1 : answer;
    }
}
