import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> hm = new HashMap<>();
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                if(!hm.containsKey(key.charAt(i))
                || hm.get(key.charAt(i)) > i){
                    hm.put(key.charAt(i), i + 1);
                }
            }
        }
        int idx = 0;
        int[] answer = new int[targets.length];
        for(String target : targets){
            int sum = 0;
            for(char c : target.toCharArray()){
                if(hm.containsKey(c)) sum += hm.get(c);
            }
            sum = sum == 0 ? -1 : sum;
            answer[idx++] = sum;
        }
        return answer;
    }
}
