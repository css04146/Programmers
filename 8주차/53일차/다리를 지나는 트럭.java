import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum = 0;
        int idx = 0;
        int answer = 0;
        int len = truck_weights.length;
        Queue<Integer> q = new LinkedList<>();
        while(idx < len){
            if(q.size() != bridge_length){
                if(sum + truck_weights[idx] <= weight){
                    q.add(truck_weights[idx]);
                    sum += truck_weights[idx++];
                    answer++;
                }
                else{
                    q.add(0);
                    answer++;
                }
            }
            else sum -= q.poll();
        }
        return answer + bridge_length;
    }
}
