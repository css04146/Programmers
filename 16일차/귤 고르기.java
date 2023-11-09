// 복습 요
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int t : tangerine) hm.put(t, hm.getOrDefault(t, 0) + 1);
        List<Integer> list = new ArrayList<>(hm.keySet());
        list.sort((o1, o2) -> hm.get(o2) - hm.get(o1)); // 길게 늘어쓰면 시간 초과 뜸.
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext() && k > 0){
            k -= hm.get(iter.next());
            answer++;
        }
        return answer;
    }
}
