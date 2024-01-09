// 복습 요망
class Solution {
    public String solution(String number, int k) {
        int idx = 0;
        int len = number.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len - k; i++){
            int max = 0;
            for(int j = idx; j <= i + k; j++){
                int n = number.charAt(j) - '0';
                if(n > max){
                    max = n;
                    idx = j;
                }
            }
            sb.append(number.charAt(idx++));
        }
        return sb.toString();
    }
}
