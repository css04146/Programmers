// 이 방법이 아닌 다른 방법으로 복습 요
class Solution {
    public String solution(int n, int t, int m, int p) {
        int num = 0;
        String answer = "";
        String target = "";
        while(target.length() < t * m){
            String temp = Integer.toString(num++, n);
            target += temp.toUpperCase();
        }
        for(int i = 0; i < target.length(); i++){
            if(t == 0) break;
            if(i % m == p - 1){
                answer += target.charAt(i);
                t--;
            }
        }
        return answer;
    }
}
