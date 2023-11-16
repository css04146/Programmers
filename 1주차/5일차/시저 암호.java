// 다음번에 복습하고 패스
import java.util.Arrays;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            c[i] = c[i] == ' ' ? c[i] : c[i] >= 'a' ?
            (char)((c[i] - 'a' + n) % 26 + 'a') :
            (char)((c[i] - 'A' + n) % 26 + 'A');
        }
        return new StringBuilder(new String(c)).toString();
    }
}
