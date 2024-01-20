import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int q : queue1) q1.add(q);
        for(int q : queue2) q2.add(q);
        long sum1 = Arrays.stream(queue1).sum();
        long sum2 = Arrays.stream(queue2).sum();
        int len = queue1.length + queue2.length;
        while(sum1 != sum2){
            if(sum1 > sum2){
                if(answer >= len * 2) return -1;
                int temp = q1.poll();
                q2.add(temp);
                sum1 -= temp;
                sum2 += temp;
                answer++;
            }
            else if(sum2 > sum1){
                int temp = q2.poll();
                q1.add(temp);
                sum1 += temp;
                sum2 -= temp;
                answer++;
            }
        }
        return answer;
    }
}
