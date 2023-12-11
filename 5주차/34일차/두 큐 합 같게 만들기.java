import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long sum1 = 0;
        long sum2 = 0;
        
        int answer = 0;
        
        Queue<Long> q1 = new LinkedList<>();
        Queue<Long> q2 = new LinkedList<>();
        
        for(int i : queue1){
            q1.add((long)i);
            sum1 += i;
        }
        
        for(int i : queue2){
            q2.add((long)i);
            sum2 += i;
        }
        
        int len = q1.size() + q2.size();
        
        while(sum1 != sum2){
            if(answer >= len * 2) return -1;
            
            if(sum1 > sum2){
                long temp = q1.poll();
                q2.add(temp);
                sum1 -= temp;
                sum2 += temp;
                answer++;
            }
            
            else if(sum1 < sum2){
                long temp = q2.poll();
                q1.add(temp);
                sum1 += temp;
                sum2 -= temp;
                answer++;
            }
        }
        
        return answer;
    }
}
