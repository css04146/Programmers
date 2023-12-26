class Solution {
    public String solution(String s) {
        int idx = 0;
        String answer = "";
        for(String temp : s.split("")){
            answer += idx++ == 0 ? temp.toUpperCase() : temp.toLowerCase();
            if(temp.equals(" ")) idx = 0;
        }
        return answer;
    }
}
