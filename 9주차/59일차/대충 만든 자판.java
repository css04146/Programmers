// 복습 요망
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> hm = new HashMap<>();
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                char c = key.charAt(i);
                if(!hm.containsKey(c) || hm.get(c) > i + 1){
                    hm.put(c, i + 1);
                }
            }
        }
        for(int i = 0; i < targets.length; i++){
            int sum = 0;
            for(char c : targets[i].toCharArray()){
                if(hm.containsKey(c)) sum += hm.get(c);
                else{
                    sum = 0;
                    break;
                }
            }
            sum = sum == 0 ? -1 : sum;
            answer[i] = sum;
        }
        return answer;
    }
}
