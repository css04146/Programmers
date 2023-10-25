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
