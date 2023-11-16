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
// 다른 방법으로 복습 요.
// 밑의 코드는 다른 방식으로 풀어본 것
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++){
            int temp = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]);
            if(max < temp){
                max = temp;
                list.add(1);
            }
            else if(max >= temp){
                int t = list.remove(list.size() - 1);
                list.add(t + 1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
