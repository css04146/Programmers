// 복습 요
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);
        Map<Double, Integer> hm = new HashMap<>();
        for(int weight : weights){
            double temp1 = (double)weight;
            double temp2 = weight * 2.0 / 3.0;
            double temp3 = weight / 2.0;
            double temp4 = weight * 3.0 / 4.0;
            if(hm.containsKey(temp1)) answer += hm.get(temp1);
            if(hm.containsKey(temp2)) answer += hm.get(temp2);
            if(hm.containsKey(temp3)) answer += hm.get(temp3);
            if(hm.containsKey(temp4)) answer += hm.get(temp4);
            hm.put(temp1, hm.getOrDefault(temp1, 0) + 1);
        }
        return answer;
    }
