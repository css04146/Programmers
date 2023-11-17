class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toUpperCase();
        String[] str = s.split(" ");
        for(String i : str){
            if(i.equals("")) answer += " ";
            else{
                char c = i.charAt(0);
                String temp = i.substring(1).toLowerCase();
                answer += (c + temp);
                answer += " ";
            }
        }
        if(s.substring(s.length() - 1, s.length()).equals(" ")) return answer;
        return answer.substring(0, answer.length() - 1);
    }
}
