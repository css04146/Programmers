class Solution {
    public String solution(String s) {
        int count = 0;
        String answer = "";
        s = s.toUpperCase();
        for(String i : s.split("")){
            answer += count++ % 2 == 0 ? i : i.toLowerCase();
            if(i.equals(" ")) count = 0;
        }
        return answer;
    }
}
