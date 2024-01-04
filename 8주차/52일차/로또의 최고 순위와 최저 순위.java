import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int count_0 = 0;
        
        List<Integer> list = new ArrayList<>();
        for(int win_num : win_nums) list.add(win_num);
        
        for(int l : lottos){
            if(l == 0) count_0++;
            if(list.contains(l)) count++;
        }
        
        int[] answer = new int[2];
        Arrays.fill(answer, 7 - count);
        answer[0] -= count_0;
        
        answer[0] = answer[0] == 7 ? 6 : answer[0];
        answer[1] = answer[1] == 7 ? 6 : answer[1];
        return answer;
    }
}
