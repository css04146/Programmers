import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray(); Arrays.sort(c);
        return new StringBuilder(new String(c)).reverse().toString();
    }
}
