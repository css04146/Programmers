import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++){
            double temp = 100 - progresses[i];
            temp = Math.ceil(temp / speeds[i]);
            if((int)temp > max){
                max = (int)temp;
                list.add(1);
            }
            else{
                int size = list.size();
                int n = list.remove(size - 1);
                list.add(n + 1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
