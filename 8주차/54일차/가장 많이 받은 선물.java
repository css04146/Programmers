import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> fp = new HashMap<>(); // 선물 지수
        Map<String, Integer> hidx = new HashMap<>(); // 받은 선물
        Map<String, Map<String, Integer>> hm = new HashMap<>();
        for(String friend1 : friends){
            hm.put(friend1, new HashMap<>());
            for(String friend2 : friends){
                if(friend1.equals(friend2)) continue;
                hm.get(friend1).put(friend2, 0);
                fp.put(friend1, 0);
                // 준 사람, 받은 사람, 준 개수
                // 준 사람, 총 선물 준 개수
            }   hidx.put(friend1, 0);
        }
        for(String gift : gifts){
            String[] temp = gift.split(" ");
            String fr = temp[0];
            String to = temp[1];
            hm.get(fr).put(to, hm.get(fr).get(to) + 1);
            fp.put(fr, fp.get(fr) + 1);
            fp.put(to, fp.get(to) - 1);
        }
        for(String key1 : hm.keySet()){
            Map<String, Integer> ht = hm.get(key1);
            for(String key2 : ht.keySet()){
                if(key1.equals(key2)) continue;
                int temp1 = hm.get(key1).get(key2); // key1이 key2에게 준 선물 갯수
                int temp2 = hm.get(key2).get(key1); // key2가 key1에게 준 선물 갯수
                if(temp1 == temp2){ // 선물 개수가 같거나 없을 경우
                    if(fp.get(key1) == fp.get(key2)) continue;
                    else if(fp.get(key1) > fp.get(key2)) hidx.put(key1, hidx.get(key1) + 1);
                    else hidx.put(key2, hidx.get(key2) + 1);
                }
                else{
                    if(temp1 > temp2) hidx.put(key1, hidx.get(key1) + 1);
                    else if(temp2 > temp1) hidx.put(key2, hidx.get(key2) + 1);
                    else continue;
                }
            }
        }
        for(String key : hidx.keySet()){
            answer = Math.max(hidx.get(key), answer);
        }
        return answer / 2;
    }
}
