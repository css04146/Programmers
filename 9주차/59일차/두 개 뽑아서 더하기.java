import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i == j) continue;
                int value = numbers[i] + numbers[j];
                if(!list.contains(value)) list.add(value);
            }
        }
        java.util.Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
