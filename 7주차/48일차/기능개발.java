import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int temp = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++){
            int day = 100 - progresses[i];
            day = (int)Math.ceil((double)day / speeds[i]);
            if(temp < day){
                temp = day;
                list.add(1);
            }
            else{
                int value = list.remove(list.size() - 1);
                list.add(value + 1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
