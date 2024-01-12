import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int count_0 = 0;
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        for(int win_num : win_nums) list.add(win_num);
        for(int lotto : lottos){
            if(list.contains(lotto)) count++;
            else if(lotto == 0) count_0++;
        }
        answer[0] = 7 - count - count_0;
        answer[1] = 7 - count == 7 ? 6 : 7 - count;
        answer[0] = answer[0] == 7 ? 6 : answer[0];
        return answer;
    }
}
