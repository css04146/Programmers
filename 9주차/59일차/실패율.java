import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Integer> hm = new HashMap<>();
        Map<Integer, Double> hidx = new HashMap<>();
        for(int s : stages) hm.put(s, hm.getOrDefault(s, 0) + 1);
        int sum = stages.length;
        for(int i = 1; i <= N; i++){
            if(sum == 0) hidx.put(i, 0.0);
            else hidx.put(i, hm.getOrDefault(i, 0) / (double)sum);
            sum -= hm.getOrDefault(i, 0);
        }
        List<Integer> list = new ArrayList<>(hidx.keySet());
        list.sort((o1, o2) -> Double.compare(hidx.get(o2), hidx.get(o1)));
        return list.stream().mapToInt(i -> i).toArray();
    }
}
