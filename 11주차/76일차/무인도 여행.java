import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
class Solution {
    public int[] solution(String[] maps) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int height = maps.length;
        int width = maps[0].length();
        List<int[]> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visit = new boolean[height][width];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(maps[i].charAt(j) != 'X'){
                    list.add(new int[]{i, j});
                }
            }
        }
        for(int[] temp : list){
            int sum = 0;
            if(!visit[temp[0]][temp[1]]){
                q.add(new int[]{temp[0], temp[1]});
                sum += maps[temp[0]].charAt(temp[1]) - '0';
                visit[temp[0]][temp[1]] = true;
                while(!q.isEmpty()){
                    int[] t = q.poll();
                    int x = t[0];
                    int y = t[1];
                    for(int i = 0; i < 4; i++){
                        int cx = x + dx[i];
                        int cy = y + dy[i];
                        if(cx < 0 || cx >= height
                        || cy < 0 || cy >= width) continue;
                        if(maps[cx].charAt(cy) != 'X'
                        && !visit[cx][cy]){
                            q.add(new int[]{cx, cy});
                            sum += maps[cx].charAt(cy) - '0';
                            visit[cx][cy] = true;
                        }
                    }
                }
                answer.add(sum);
            }
        }
        Collections.sort(answer);
        if(list.isEmpty()) return new int[]{-1};
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
