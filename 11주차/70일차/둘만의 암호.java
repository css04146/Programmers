class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            for(int i = 0; i < index; i++){
                c = c == 'z' ? 'a' : (char)(c + 1);
                while(skip.contains(String.valueOf(c))){
                    c = c == 'z' ? 'a' : (char)(c + 1);
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
