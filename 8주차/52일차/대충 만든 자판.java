import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> hm = new HashMap<>();
        for(String key : keymap){
            int len = key.length();
            for(int i = 0; i < len; i++){
                char c = key.charAt(i);
                if(!hm.containsKey(c) || hm.get(c) > i){
                    hm.put(c, i);
                }
            }
        }
        int len = targets.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            int sum = 0;
            for(char c : targets[i].toCharArray()){
                if(sum == -1) break;
                if(hm.containsKey(c)) sum += hm.get(c) + 1;
                else sum = -1;
            }
            answer[i] = sum;
        }
        return answer;
    }
}
