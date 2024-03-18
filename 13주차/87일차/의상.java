import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Set<String>> hm = new HashMap<>();
        for(String c[] : clothes){
            if(hm.containsKey(c[1])) hm.get(c[1]).add(c[0]);
            else{
                hm.put(c[1], new HashSet<>());
                hm.get(c[1]).add(c[0]);
            }
        }
        for(String s : hm.keySet()){
            int size = hm.get(s).size() + 1;
            answer *= size;
        }
        return answer - 1;
    }
}
