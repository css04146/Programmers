import java.util.Arrays;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 0;
        int[] answer = new int[100];
        for(int i = 0; i < speeds.length; i++){
            while(progresses[i] + speeds[i] * day < 100) day++;
            answer[day]++;
        }
        return Arrays.stream(answer).filter(i -> i != 0).toArray();
    }
}
