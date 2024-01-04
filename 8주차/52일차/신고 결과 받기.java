import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int len = id_list.length;
        int[] answer = new int[len];
        Map<String, Integer> hidx = new HashMap<>();
        Map<String, Set<String>> hm = new HashMap<>();
        for(int i = 0; i < len; i++) hidx.put(id_list[i], i);
        for(String id : id_list) hm.put(id, new HashSet<>());
        for(String r : report){
            String[] temp = r.split(" ");
            String fr = temp[0];
            String to = temp[1];
            hm.get(to).add(fr);
        }
        for(String key : hm.keySet()){
            Set<String> send = hm.get(key);
            if(send.size() >= k){
                for(String s : send){
                    answer[hidx.get(s)]++;
                }
            }
        }
        return answer;
    }
}
