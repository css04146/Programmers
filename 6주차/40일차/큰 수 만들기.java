// 복습 요
class Solution {
    public String solution(String number, int k) {
        int len = number.length(), idx = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len - k; i++){
            int max = 0;
            for(int j = idx; j <= i + k; j++){
                int n = number.charAt(j) - '0';
                if(n > max){
                    max = n;
                    idx = j + 1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
