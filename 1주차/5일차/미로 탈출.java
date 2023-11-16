import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;
class Solution {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    public int solution(String[] maps) {
        int leverlevel = 1;
        int height = maps.length;
        int width = maps[0].length();
        int endx = -1, endy = -1;
        int leverx = -1, levery = -1;
        int startx = -1, starty = -1;
        Queue<int[]> q = new LinkedList<>();
        int[][] time = new int[height][width];
        for(int i = 0; i < maps.length; i++){ // i와 j의 순서를 바꾸려고 시도했었지만 이렇게 시도할 시, 번거롭게 배열을 n번씩 반복하는 절차로 인한 시간 지연 이슈로 실패가 뜨는 것으로 예상됨.
            for(int j = 0; j < maps[0].length(); j++){
                if(maps[i].charAt(j) == 'S'){ startx = j; starty = i; }
                else if(maps[i].charAt(j) == 'L'){ leverx = j; levery = i; }
                else if(maps[i].charAt(j) == 'E'){ endx = j; endy = i; }
            }
        }
        if(startx == endx && endx == endy) return 0;
        q.add(new int[]{startx, starty});
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int x = temp[0]; int y = temp[1];
            for(int i = 0; i < 4; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                if(cx < 0 || cx >= width
                || cy < 0 || cy >= height) continue;
                if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'L'){
                    time[cy][cx] = time[y][x] + 1;
                    q.add(new int[]{cx, cy});
                    leverlevel--;
                    break;
                }
                else if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'O'){
                        time[cy][cx] = time[y][x] + 1;
                        q.add(new int[]{cx, cy});
                }
                else if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'E'){
                        time[cy][cx] = time[y][x] + 1;
                        q.add(new int[]{cx, cy});
                }
            }
        }
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
                if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'E'){
                    time[cy][cx] = time[y][x] + 1;
                    q.add(new int[]{cx, cy});
                    break;
                }
                else if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'O'){
                        time[cy][cx] = time[y][x] + 1;
                        q.add(new int[]{cx, cy});
                }
                else if(time[cy][cx] == 0 && maps[cy].charAt(cx) == 'S'){
                        time[cy][cx] = time[y][x] + 1;
                        q.add(new int[]{cx, cy});
                }
            }
        }
        if(leverlevel == 1) return -1;
        int answer = time[endy][endx];
        return answer == 0 ? -1 : answer;
    }
}
