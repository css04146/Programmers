// 복습 
import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sum = 0, idx = 0, answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < bridge_length; i++) q.add(0);
        while(idx < truck_weights.length){
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
//
import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0, idx = 0;
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
