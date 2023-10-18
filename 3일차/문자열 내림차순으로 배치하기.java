import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(""); // char는 Collections.reverseOrder() 사용 못함
        Arrays.sort(str, Collections.reverseOrder());
        for(int i = 0; i < str.length; i++){
            answer += str[i];
        }
        return answer;
    }
}
