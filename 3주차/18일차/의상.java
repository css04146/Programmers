// 복습 요
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Set<String>> hm = new HashMap<>();
        for(String[] c : clothes) hm.put(c[1], new HashSet<>());
        for(String[] c : clothes) hm.get(c[1]).add(c[0]);
        for(String key : hm.keySet()) answer *= (hm.get(key).size() + 1);
        return answer - 1;
    }
}
