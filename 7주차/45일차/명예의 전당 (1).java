import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for(int s : score){
            if(list1.size() < k){
                list1.add(s);
                Collections.sort(list1);
                list2.add(list1.get(0));
            }
            else if(list1.size() == k){
                list1.add(s);
                Collections.sort(list1);
                list1.remove(0);
                list2.add(list1.get(0));
            }
        }
        
        return list2.stream().mapToInt(i -> i).toArray();
    }
}
