class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int len = signs.length;
        for(int i = 0; i < len; i++){
            int temp = absolutes[i];
            answer += signs[i] ? temp : temp * (-1);
        }
        return answer;
    }
}
