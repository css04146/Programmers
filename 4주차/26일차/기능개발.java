import java.util.Arrays;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 0;
        int[] answer = new int[100];
        for(int i = 0; i < speeds.length; i++){
            while(progresses[i] + day * speeds[i] < 100) day++;
            answer[day]++;
        }
        return Arrays.stream(answer).filter(i -> i != 0).toArray();
    }
}
//
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int max = -1;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++){
            int temp = 100 - progresses[i];
            temp = (int)Math.ceil(temp / (double)speeds[i]);
            if(temp <= max){
                int size = list.remove(list.size() - 1);
                list.add(size + 1);
            }
            else{
                max = temp;
                list.add(1);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
