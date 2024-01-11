// 복습 요망
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr) if(i % divisor == 0) list.add(i);
        if(list.isEmpty()) list.add(-1);
        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
//
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        Arrays.sort(answer);
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
