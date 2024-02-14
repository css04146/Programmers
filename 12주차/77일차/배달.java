// 실패 코드
import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 1;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 2; i <= N; i++){
            int len = road.length;
            int min = Integer.MAX_VALUE;
            int length = -1; // 총 도로 길이 선언
            for(int j = 0; j < len; j++){ // 각 도로
                length = 0; // 총 도로 길이 초기화
                int start = i; // 시작 지점을 i로 저장
                boolean[] visit = new boolean[len];
                if(start == road[j][0] || start == road[j][1]){
                    q.add(road[j]); // 큐에 추가
                    length += road[j][2];
                } // 갈 수 있는 길이라면 큐에 추가
                if(start == road[j][0]) start = road[j][1];
                if(start == road[j][1]) start = road[j][0];
                int idx = j; // idx를 j로 고정
                while(!q.isEmpty()){
                    int[] temp = q.poll();
                    if(!visit[idx]){
                        visit[idx] = true;
                        for(int k = 0; k < len; k++){
                            if(start == road[k][0] || start == road[k][1]){
                                q.add(road[k]); // 큐에 추가
                                length += road[k][2];
                            } // 갈 수 있는 길이라면 큐에 추가
                            if(start == road[k][0]) start = road[k][1];
                            if(start == road[k][1]) start = road[k][0];
                            idx = k; // idx를 j로 고정
                        }
                    }
                }
            }
            min = Math.min(length, min);
            answer = min <= K ? answer + 1 : answer;
        }
        return answer;
    }
}
/*******************************************************************************/
