import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for(int s : score){
            if(list.isEmpty()){
                answer.add(s);
                list.add(s);
            } else{
                list.add(s);
                java.util.Collections.sort(list);
                if(list.size() > k) list.remove(0);
                answer.add(list.get(0));
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
