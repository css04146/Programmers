// 작성 중인 코드
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
class Solution {
    int answer = Integer.MAX_VALUE;
    public int solution(int n, int[][] wires) {
        boolean[][] visit = new boolean[n + 1][n + 1];
        for(int[] w : wires) visit[w[0]][w[1]] = true;
        for(int[] w : wires){
            visit[w[0]][w[1]] = false;
            findMin(visit, wires, w);
            visit[w[0]][w[1]] = true;
        }
        return answer;
    }
    public void findMin(boolean[][] visit, int[][] wires, int[] w){
        Queue<int[]> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int[] wire : wires){ // 전력망과 연결할 수 있는 전력망 확인
            if(w[0] == wire[0] || w[0] == wire[1]
            || w[1] == wire[0] || w[1] == wire[1]){
                int count = 1; // 연결된 전력망 개수
                q.add(new int[]{wire[0], wire[1]});
                if(w[0] == wire[0]){
                    w[0] = wire[0];
                    w[1] = wire[1];
                } else if(w[0] == wire[1]){
                    w[0] = wire[1];
                    w[1] = wire[0];
                } else if(w[1] == wire[0]){
                    w[1] = wire[0];
                    w[0] = wire[1];
                } else{
                    w[1] = wire[1];
                    w[0] = wire[0];
                }
                while(!q.isEmpty()){
                    int[] temp = q.poll();
                    int x = temp[0];
                    int y = temp[1];
                }
            }
        }
    }
}
