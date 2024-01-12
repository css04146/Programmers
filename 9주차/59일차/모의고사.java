import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] arr = new int[3];
        int len = answers.length;
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i = 0; i < answers.length; i++){
            if(arr1[i % 5] == answers[i]) arr[0]++;
            if(arr2[i % 8] == answers[i]) arr[1]++;
            if(arr3[i % 10] == answers[i]) arr[2]++;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) if(arr[i] == max) list.add(i + 1);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
