import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>();
        for(int s : scoville) q.add(s);
        while(q.size() >= 2 && q.peek() < K){
            if(answer > scoville.length) break;
            q.add(q.poll() + q.poll() * 2);
            answer++;
        }
        return q.peek() < K ? -1 : answer;
    }
}
