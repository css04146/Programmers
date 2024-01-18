import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int len = want.length;
        Map<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < len; i++) hm.put(want[i], number[i]);
        for(int i = 0; i <= discount.length -10; i++){
            Map<String, Integer> ht = new HashMap<>();
            for(int j = i; j < i + 10; j++){
                String temp = discount[j];
                ht.put(discount[j], ht.getOrDefault(discount[j], 0) + 1);
            }
            boolean isTrue = true;
            for(String key : ht.keySet()){
                if(ht.get(key) != hm.get(key)) isTrue = false;
            }
            if(isTrue) answer++;
        }
        return answer;
    }
}
