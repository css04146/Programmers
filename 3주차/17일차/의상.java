// 복습 요
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> hm = new HashMap<>();
        for(String[] c : clothes) hm.put(c[1], hm.getOrDefault(c[1] , 0) + 1);
        Iterator<String> iter = hm.keySet().iterator();
        while(iter.hasNext()) answer *= (hm.get(iter.next()) + 1);
        return answer - 1;
    }
}
