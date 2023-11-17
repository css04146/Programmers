import java.util.Queue;
import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>();
        for(int s : scoville) q.add(s);
        while(q.size() > 1 && q.peek() < K){
            q.add(q.poll() + q.poll() * 2);
            answer++;
        }
        if(q.peek() < K) return -1;
        return answer;
    }
}
