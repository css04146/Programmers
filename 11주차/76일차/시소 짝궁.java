import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);
        Map<Double, Integer> hm = new HashMap<>();
        for(int weight : weights){
            double w1 = (double)weight;
            double w2 = (double)weight / 2;
            double w3 = (double)weight / 3 * 2;
            double w4 = (double)weight / 4 * 3;
            if(hm.containsKey(w1)) answer += hm.get(w1);
            if(hm.containsKey(w2)) answer += hm.get(w2);
            if(hm.containsKey(w3)) answer += hm.get(w3);
            if(hm.containsKey(w4)) answer += hm.get(w4);
            hm.put(w1, hm.getOrDefault(w1, 0) + 1);
        }
        return answer;
    }
}
