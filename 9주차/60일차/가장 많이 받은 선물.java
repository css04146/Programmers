import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> fg = new HashMap<>();
        Map<String, Integer> fp = new HashMap<>();
        Map<String, Map<String, Integer>> hm = new HashMap<>();
        for(String friend1 : friends){
            hm.put(friend1, new HashMap<>());
            for(String friend2 : friends){
                if(friend1.equals(friend2)) continue;
                hm.get(friend1).put(friend2, 0);
            }
            fp.put(friend1, 0);
            fg.put(friend1, 0);
        }
        for(String gift : gifts){
            String[] temp = gift.split(" ");
            fp.put(temp[0], fp.get(temp[0]) + 1);
            fp.put(temp[1], fp.get(temp[1]) - 1);
            Map<String, Integer> ht = hm.get(temp[0]);
            ht.put(temp[1], ht.get(temp[1]) + 1);
        }
        for(String friend1 : hm.keySet()){
            Map<String, Integer> ht = hm.get(friend1);
            for(String friend2 : ht.keySet()){
                if(hm.get(friend2).get(friend1) == ht.get(friend2)){
                    if(fp.get(friend1) > fp.get(friend2)){
                        fg.put(friend1, fg.get(friend1) + 1);
                    } else if(fp.get(friend2) > fp.get(friend1)){
                        fg.put(friend2, fg.get(friend2) + 1);
                    }
                }
                else if(hm.get(friend2).get(friend1) > ht.get(friend2)){
                    fg.put(friend2, fg.get(friend2) + 1);
                } else fg.put(friend1, fg.get(friend1) + 1);
            }
        }
        for(String key : fg.keySet()) answer = Math.max(answer, fg.get(key));
        return answer / 2;
    }
}
