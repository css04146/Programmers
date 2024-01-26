class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            for(int j = i - 1; j >= 0; j--){
                if(s.charAt(i) == s.charAt(j)){
                    answer[i] = i - j;
                    break;
                }
            }
            answer[i] = answer[i] == 0 ? -1 : answer[i];
        }
        return answer;
    }
}
