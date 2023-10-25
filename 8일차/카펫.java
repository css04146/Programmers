class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int[] answer = new int[2];
        for(int i = yellow; i >= 1; i--){
            if(yellow % i != 0) continue;
            int div = yellow / i;
            if((div + 2) * (i + 2) == sum){
                answer[0] = i + 2;
                answer[1] = div + 2;
                return answer;
            }
        }
        return answer;
    }
}
