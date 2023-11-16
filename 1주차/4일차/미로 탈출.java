import java.util.Queue;
import java.util.LinkedList;
class Solution {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    public int solution(String[] maps) {
        int leverlevel = 1;
        int endx = -1, endy = -1;
        int height = maps.length;
        int width = maps[0].length();
        int startx = -1, starty = -1;
        int leverx = -1, levery = -1;
        Queue<int[]> q = new LinkedList<>();
        int[][] time = new int[height][width];
        boolean[][] visit = new boolean[height][width];
        for(int i = 0; i < maps.length; i++){
            for(int j = 0; j < maps[0].length(); j++){
                char c = maps[i].charAt(j);
                if(c == 'S'){ startx = j; starty = i; }
                else if(c == 'E'){ endx = j; endy = i; }
                else if(c == 'L'){ leverx = j; levery = i; }
            }
        }
        if(startx == endx && starty == endy) return 0;
        q.add(new int[]{startx, starty});
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int x = temp[0]; int y = temp[1];
            for(int i = 0; i < 4; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                if(cx < 0 || cx >= width
                || cy < 0 || cy >= height) continue;
                if(time[cy][cx] != 0) continue;
                if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'L'){
                    q.add(new int[]{cx, cy});
                    time[cy][cx] = time[y][x] + 1;
                    leverlevel--;
                }
                else if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'O'){
                    q.add(new int[]{cx, cy});
                    time[cy][cx] = time[y][x] + 1;
                }
                else if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'E'){
                    q.add(new int[]{cx, cy});
                    time[cy][cx] = time[y][x] + 1;
                }
            }
        }
        // 레버 찾기
        int temp = time[levery][leverx];
        time = new int[height][width];
        time[levery][leverx] = temp;
        q.add(new int[]{leverx, levery});
        while(!q.isEmpty()){
            int[] tem = q.poll();
            int x = tem[0]; int y = tem[1];
            for(int i = 0; i < 4; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                if(cx < 0 || cx >= width
                || cy < 0 || cy >= height) continue;
                if(time[cy][cx] != 0) continue;
                if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'S'){
                    q.add(new int[]{cx, cy});
                    time[cy][cx] = time[y][x] + 1;
                }
                if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'O'){
                    q.add(new int[]{cx, cy});
                    time[cy][cx] = time[y][x] + 1;
                }
                else if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'E'){
                    q.add(new int[]{cx, cy});
                    time[cy][cx] = time[y][x] + 1;
                }
            }
        }
        // 레버부터 출구 찾기
        int answer = time[endy][endx];
        if(leverlevel == 1) return -1;
        return answer == 0 ? -1 : answer;
    }
}
