class Solution {
    public String solution(int n, int t, int m, int p) {
        int number = 0;
        String temp ="";
        String answer = "";
        while(temp.length() < t * m + p){
            temp += Integer.toString(number++, n).toUpperCase();
        }
        for(int i = p - 1; i < t * m + p - 1; i += m){
            answer += temp.charAt(i);
        }
        return answer;
    }
}
