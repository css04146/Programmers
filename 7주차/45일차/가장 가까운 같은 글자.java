class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        for(int i = len - 1; i >= 0; i--){
            for(int j = i - 1; j >= 0; j--){
                if(s.charAt(i) == s.charAt(j)){
                    answer[i] = i - j;
                    break;
                }
            }
            answer[i] = answer[i] == 0 ? -1 : answer[i];
        }
        return answer;
    }
}
// 밑에 방법은 복습해볼 것
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        Map<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < len; i++){
            answer[i] = i - hm.getOrDefault(s.charAt(i), i + 1);
            hm.put(s.charAt(i), i);
        }
        return answer;
    }
}
