import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int len = want.length;
        Map<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < len; i++) hm.put(want[i], number[i]);
        for(int i = 0; i <= discount.length - 10; i++){
            Map<String, Integer> temp = new HashMap<>(); // Map<String, Integer> temp = hm; temp와 hm이 한 몸(같은 객체)이기 때문에 답이 되지 않는다.
            boolean bo = true;
            for(int j = i; j < i + 10; j++){
                String s = discount[j];
                temp.put(s, temp.getOrDefault(s, 0) + 1);
            }
            for(String key : temp.keySet()){
                if(hm.get(key) != temp.get(key)) bo = false;
            }
            if(bo) answer++;
        }
        return answer;
    }
}
