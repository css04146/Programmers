import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new StringBuilder().append(c).reverse().toString();
    }
}
