class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6) return false;
        for(char c : s.toCharArray()) if(!Character.isDigit(c)) return false;
        return answer;
    }
}
//
class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int n = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
}
