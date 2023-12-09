import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum = 0;
        int idx = 0;
        int answer = 0;
        int len = truck_weights.length;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < bridge_length; i++) q.add(0);
        while(idx < len){
            sum -= q.poll();
            if(sum + truck_weights[idx] <= weight){
                sum += truck_weights[idx];
                q.add(truck_weights[idx++]);
                answer++;
            }
            else{
                q.add(0);
                answer++;
            }
        }
        return answer + bridge_length;
    }
}
