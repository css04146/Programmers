class Solution {
    public String solution(String s, int n) {
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(c[i] >= 'a') c[i] = (char)(((c[i] - 'a' + n) % 26) + 'a');
            else if(c[i] >= 'A') c[i] = (char)(((c[i] - 'A' + n) % 26) + 'A');
        }
        return new StringBuilder(new String(c)).toString();
    }
}
