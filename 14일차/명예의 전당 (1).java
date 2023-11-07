// 복습
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < score.length; i++){
            if(list.size() < k){
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
            }
            else{
                if(list.get(0) > score[i]){
                    answer[i] = list.get(0);
                }
                else{
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);
                    answer[i] = list.get(0);
                }
            }
        }
        return answer;
    }
}
