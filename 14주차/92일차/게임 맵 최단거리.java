import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int x = temp[0];
            int y = temp[1];
            for(int i = 0; i < 4; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                if(cx < 0 || cx >= maps.length ||
                   cy < 0 || cy >= maps[0].length) continue;
                if(maps[cx][cy] == 1){
                    maps[cx][cy] += maps[x][y];
                    q.add(new int[]{cx, cy});
                }
            }
        }
        int answer = maps[maps.length - 1][maps[0].length - 1];
        return answer == 1 ? -1 : answer;
    }
}
