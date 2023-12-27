import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> hm = new HashMap<>();
        for(String term : terms){
            String[] temp = term.split(" ");
            hm.put(temp[0], Integer.parseInt(temp[1]));
        }
        
        String[] time = today.split("\\.");
        int year = Integer.parseInt(time[0]);
        int month = Integer.parseInt(time[1]);
        int day = Integer.parseInt(time[2]);
        int curTime = year * 12 * 28 + month * 28 + day;
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++){
            String[] psplit = privacies[i].split(" ");
            String[] pday = psplit[0].split("\\.");
            if(!hm.containsKey(psplit[1])) continue;
            int privacy_time = hm.get(psplit[1]);
            int pyear = Integer.parseInt(pday[0]);
            int pmonth = Integer.parseInt(pday[1]);
            int p_day = Integer.parseInt(pday[2]);
            int ptime = pyear * 28 * 12 + pmonth * 28 + p_day;
            ptime += privacy_time * 28;
            if(ptime <= curTime) list.add(i + 1);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
