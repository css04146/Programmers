// 복습 요
import java.util.Arrays;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 0;
        int[] function = new int[100];
        for(int i = 0; i < progresses.length; i++){
            while(progresses[i] + speeds[i] * day < 100) day++;
            function[day]++;
        }
        return Arrays.stream(function).filter(i -> i != 0).toArray();
    }
}
//
