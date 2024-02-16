// 실패 코드
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;;
class Solution {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    public int[] solution(String[][] places) {
        int height = places.length;
        int width = places[0].length;
        Queue<int[]> q = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        boolean isKeeped = false;
        for(int i = 0; i < height; i++){
            isKeeped = true; // 거리두기 지켜지는지
            for(int j = 0; j < width; j++){
                if(places[i][j].equals("P")){
                    q.add(new int[]{i, j, 0});
                    while(!q.isEmpty()){
                        int[] temp = q.poll();
                        int x = temp[0];
                        int y = temp[1];
                        int count = temp[2];
                        boolean[][] visit = new boolean[height][width];
                        visit[x][y] = true;
                        if(count < 2){
                            for(int a = 0; a < 4; a++){
                                int cx = x + dx[a];
                                int cy = y + dy[a];
                                if(cx < 0 || cx > 4
                                || cy < 0 || cy > 4) continue;
                                if(!visit[cx][cy]){
                                    
                                }
                                if(places[cx][cy].equals("X")) continue;
                                else if(places[cx][cy].equals("O")){
                                    for(int b = 0; b < 4; b++){
                                        cx += dx[b];
                                        cy += dy[b];
                                        if(cx < 0 || cx > 4
                                        || cy < 0 || cy > 4) continue;
                                        if(places[cx][cy].equals("P")){
                                            isKeeped = false;
                                            break;
                                        }
                                    }
                                } else{
                                    isKeeped = false; // 거리두기 안 지켜짐
                                    break;
                                }
                                q.add(new int[]{cx, cy, count + 1});
                            }
                        }
                    }
                }
                if(!isKeeped){
                    answer.add(0);
                    break;
                } else if(j == width - 1 && isKeeped){
                    answer.add(1);
                }
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
/*********************************************************************************/
