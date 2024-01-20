import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum = 0;
        int answer = 0;
        int len = bridge_length;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < len; i++) q.add(0);
        for(int i = 0; i < truck_weights.length; i++){
            sum -= q.poll();
            int truck_weight = truck_weights[i];
            if(sum + truck_weight <= weight){
                sum += truck_weight;
                q.add(truck_weight);
                answer++;
            }
            else{
                q.add(0);
                answer++;
                i--;
            }
        }
        return answer + len;
    }
}
