// 복습
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        for(int i = 0; i <= t.length() - len; i++){
            String temp = t.substring(i, i + len);
            long n = Long.parseLong(temp); // long으로 선언해야 정답됨.
            if(n <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}
