import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Set<String>> hm = new HashMap<>(); // 신고한 사람
        Map<String, Integer> hidx = new HashMap<>(); // id_list 순서
        
        for(int i = 0; i < id_list.length; i++){
            hidx.put(id_list[i], i);
            hm.put(id_list[i], new HashSet<String>());
        }
        
        for(String r : report){
            String[] temp = r.split(" ");
            String from = temp[0];
            String to = temp[1];
            hm.get(to).add(from);
        }
        
        for(String key : hm.keySet()){
            Set<String> send = hm.get(key);
            if(send.size() >= k){
                for(String i : send){
                    answer[hidx.get(i)]++;
                }
            }
        }
      
        return answer;
    }
}
