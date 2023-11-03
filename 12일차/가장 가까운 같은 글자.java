import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                answer[i] = i - hm.get(c);
                hm.put(c, i);
            }
            else{
                answer[i] = -1;
                hm.put(c, i);
            }
        }
        return answer;
    }
}
