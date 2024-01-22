class Solution {
    public String solution(String number, int k) {
        int idx = 0;
        int len = number.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len - k; i++){
            int max = Integer.MIN_VALUE;
            for(int j = idx; j <= i + k; j++){
                if(max < number.charAt(j) - '0'){
                    max = number.charAt(j) - '0';
                    idx = j;
                }
            }
            sb.append(number.charAt(idx++));
        }
        return sb.toString();
    }
}
