import java.util.*;
class Solution {
    public int solution(String[] maps) {
        int answer = 0;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int height = maps.length;
        int width = maps[0].length();
        int endx = -1, endy = -1;
        int startx = -1, starty = -1;
        int leverx = -1, levery = -1;
        boolean[][] visit = new boolean[height][width];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(maps[i].charAt(j) == 'S'){
                    startx = j; starty = i;
                } else if(maps[i].charAt(j) == 'E'){
                    endx = j; endy = i;
                } else if(maps[i].charAt(j) == 'L'){
                    leverx = j; levery = i;
                }
            }
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startx, starty, 0});
        while(!q.isEmpty()){
            int[] temp = q.poll();
            for(int i = 0; i < 4; i++){
                int cx = temp[0] + dx[i];
                int cy = temp[1] + dy[i];
                int distance = temp[2];
                if(cx < 0 || cx >= width
                || cy < 0 || cy >= height) continue;
                if(maps[cy].charAt(cx) == 'X') continue;
                if(visit[cy][cx]) continue;
                if(maps[cy].charAt(cx) == 'L'){
                    visit[cy][cx] = true;
                    answer += distance + 1;
                }
                visit[cy][cx] = true;
                q.add(new int[]{cx, cy, distance + 1});
            }
        }
        if(!visit[levery][leverx]) return -1;
        for(boolean[] v : visit) Arrays.fill(v, false);
        q.add(new int[]{leverx, levery, 0});
        while(!q.isEmpty()){
            int[] temp = q.poll();
            for(int i = 0; i < 4; i++){
                int cx = temp[0] + dx[i];
                int cy = temp[1] + dy[i];
                int distance = temp[2];
                if(cx < 0 || cx >= width
                || cy < 0 || cy >= height) continue;
                if(maps[cy].charAt(cx) == 'X') continue;
                if(visit[cy][cx]) continue;
                if(maps[cy].charAt(cx) == 'E'){
                    visit[cy][cx] = true;
                    answer += distance + 1;
                    break;
                }
                visit[cy][cx] = true;
                q.add(new int[]{cx, cy, distance + 1});
            }
        }
        if(!visit[endy][endx]) return -1;
        return answer;
    }
}
