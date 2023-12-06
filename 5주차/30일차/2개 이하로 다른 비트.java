class Solution {
    public long[] solution(long[] numbers) {
        int len = numbers.length;
        long[] answer = new long[len];
        for(int i = 0; i < answer.length; i++){
            answer[i] = numbers[i];
            answer[i]++;
            answer[i] += (answer[i] ^ numbers[i]) >> 2;
        }
        return answer;
    }
}
