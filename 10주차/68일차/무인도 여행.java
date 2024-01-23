import java.util.List;
import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
class Solution {
    int width = -1;
    int height = -1;
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    public int[] solution(String[] maps) {
        height = maps.length;
        width = maps[0].length();
        boolean[][] visit = new boolean[height][width];
        List<int[]> start = new ArrayList<>(); // 0이 아닌 지점 저장
        List<Integer> list = new ArrayList<>(); // 정답 리스트
        for(int i = 0; i < height; i++){ // y축
            for(int j = 0; j < width; j++){ // x축
                if(maps[i].charAt(j) != 'X'){
                    start.add(new int[]{i, j});
                }
            }
        }
        for(int[] s : start){
            int sum = 0;
            Queue<int[]> q = new LinkedList<>();
            if(!visit[s[0]][s[1]]){
                q.add(s); // 방문 안 한 곳이라면
                sum += maps[s[0]].charAt(s[1]) - '0';
                visit[s[0]][s[1]] = true;
            }
            else continue;
            while(!q.isEmpty()){
                int[] temp = q.poll();
                int x = temp[0]; // y축
                int y = temp[1]; // x축
                for(int i = 0; i < 4; i++){
                    int cx = x + dx[i];
                    int cy = y + dy[i];
                    if(cx < 0 || cx >= height
                    || cy < 0 || cy >= width) continue;
                    if(maps[cx].charAt(cy) == 'X') continue;
                    if(!visit[cx][cy]){ // 방문 안 했다면
                        sum += maps[cx].charAt(cy) - '0';
                        q.add(new int[]{cx, cy});
                        visit[cx][cy] = true;
                    }
                }
            }
            list.add(sum);
        }
        Collections.sort(list);
        if(list.isEmpty()) return new int[]{-1};
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
