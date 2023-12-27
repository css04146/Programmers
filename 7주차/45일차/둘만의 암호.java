class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int len = s.length();
        for(int i = 0; i < len; i++){
            char temp = s.charAt(i);
            for(int j = 0; j < index; j++){
                temp = temp == 'z' ? 'a' : (char)(temp + 1);
                while(skip.contains(String.valueOf(temp))){
                    temp = temp == 'z' ? 'a' : (char)(temp + 1);
                }
            }
            answer += temp;
        }
        return answer;
    }
}
//
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int len = s.length();
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            int temp = 0;
            while(temp < index){
                c = c == 'z' ? 'a' : (char)(c + 1);
                if(!skip.contains(String.valueOf(c))){
                    temp++;
                }
            }
            answer += c;
        }
        return answer;
    }
}
//
