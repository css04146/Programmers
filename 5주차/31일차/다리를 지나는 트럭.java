// 복습 무조건 필요
import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum = 0;
        int idx = 0;
        int answer = 0;
        int len = truck_weights.length;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < len; i++){
            int truck = truck_weights[i];
            while(true){
                if(q.isEmpty()){
                    q.add(truck);
                    sum += truck;
                    answer++;
                    break;
                }
                else if(q.size() != bridge_length){
                    if(sum + truck <= weight){
                        q.add(truck);
                        sum += truck;
                        answer++;
                        break;
                    }
                    else{
                        q.add(0);
                        answer++;
                    }
                }
                else sum -= q.poll();
            }
        }
        return answer;
    }
}
