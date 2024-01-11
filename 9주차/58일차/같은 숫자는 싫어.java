import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(list.isEmpty()) list.add(i);
            else if(list.get(list.size() - 1) != i) list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
