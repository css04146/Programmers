// 복습 요
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                char c = keymap[i].charAt(j);
                if(!hm.containsKey(c)){
                    hm.put(c, j + 1);
                }
                else hm.put(c, Math.min(hm.get(c), j + 1));
            }
        }
        for(int i = 0; i < targets.length; i++){
            int sum = 0;
            for(int j = 0; j < targets[i].length(); j++){
                if(hm.containsKey(targets[i].charAt(j))){
                    sum += hm.get(targets[i].charAt(j));
                }
            }
            answer[i] = sum;
            if(answer[i] == 0) answer[i] = -1;
        }
        return answer;
    }
}
