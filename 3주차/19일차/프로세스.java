import java.util.Stack;
import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int priority : priorities) q.add(priority);
        while(!q.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(q.peek() == priorities[i]){
                    if(i == location){
                        answer++; return answer;
                    }
                    answer++;
                    q.poll();
                }
            }
        }
        return answer;
    }
}
