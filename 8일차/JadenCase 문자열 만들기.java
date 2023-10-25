class Solution {
    public String solution(String s) {
        int index = 0;
        s = s.toLowerCase();
        String[] str = s.split("");
        for(int i = 0; i < str.length; i++){
            str[i] = index == 0 ? str[i].toUpperCase() : str[i];
            index = str[i].equals(" ") ? 0 : index + 1;
        }
        StringBuilder sb = new StringBuilder();
        for(String st : str) sb.append(st);
        return sb.toString();
    }
}
//
class Solution {
    public String solution(String s) {
        int index = 0;
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            c[i] = index == 0 ? Character.toUpperCase(c[i]) : c[i];
            index = c[i] == ' ' ? 0 : index + 1;
        }
        return new StringBuilder(new String(c)).toString();
    }
}
