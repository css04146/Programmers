// 복습 요
class Solution {
    public String solution(String s, String skip, int index) {
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < index; j++){
                char temp = (char)(c[i] + 1);
                c[i] = temp > 'z' ? 'a' : temp;
                while(skip.contains(String.valueOf(c[i]))){
                    temp = (char)(c[i] + 1);
                    c[i] = temp > 'z' ? 'a' : temp;
                }
            }
        }
        return String.valueOf(c);
    }
}
