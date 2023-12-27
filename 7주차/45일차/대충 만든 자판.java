import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> hm = new HashMap<>();
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                char c = key.charAt(i);
                hm.put(c, Math.min(hm.getOrDefault(c, i + 1), i + 1));
            }
        }
        for(int i = 0; i < targets.length; i++){
            int sum = 0;
            for(int j = 0; j < targets[i].length(); j++){
                if(!hm.containsKey(targets[i].charAt(j))){
                    sum = 0;
                    break;
                }
                sum += hm.get(targets[i].charAt(j));
            }
            sum = sum == 0 ? -1 : sum;
            answer[i] = sum;
        }
        return answer;
    }
}
