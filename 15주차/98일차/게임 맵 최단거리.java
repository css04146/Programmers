import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int[][] maps) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        while(!q.isEmpty()){
            int[] temp = q.poll();
            for(int i = 0; i < 4; i++){
                int cx = temp[0] + dx[i];
                int cy = temp[1] + dy[i];
                if(cx < 0 || cx >= maps[0].length
                || cy < 0 || cy >= maps.length) continue;
                if(maps[cy][cx] == 1){
                    maps[cy][cx] = maps[temp[1]][temp[0]] + 1;
                    q.add(new int[]{cx, cy});
                }
            }
        }
        int answer = maps[maps.length - 1][maps[0].length - 1];
        return answer == 1 ? -1 : answer;
    }
}
