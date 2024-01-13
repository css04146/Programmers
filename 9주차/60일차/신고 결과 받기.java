import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int len = id_list.length;
        int[] answer = new int[len];
        Map<String, Integer> hidx = new HashMap<>();
        Map<String, Set<String>> hm = new HashMap<>();
        for(int i = 0; i < id_list.length; i++){
            hm.put(id_list[i], new HashSet<>());
            hidx.put(id_list[i], i);
        }
        for(String s : report){
            String[] temp = s.split(" ");
            hm.get(temp[1]).add(temp[0]);
        }
        for(String key1 : hm.keySet()){
            Set<String> set = hm.get(key1);
            if(set.size() >= k){
                for(String key2 : set){
                    answer[hidx.get(key2)]++;
                }
            }
        }
        return answer;
    }
}
