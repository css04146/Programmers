import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] temp = today.split("\\.");
        int year = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        int day = Integer.parseInt(temp[2]);
        int curTime = year * 28 * 12 + month * 28 + day;
        Map<String, Integer> hm = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        for(String term : terms){
            temp = term.split(" ");
            int period = Integer.parseInt(temp[1]);
            hm.put(temp[0], period);
        }
        for(int i = 0; i < privacies.length; i++){
            temp = privacies[i].split(" ");
            String privacy = temp[1];
            String[] psplit = temp[0].split("\\.");
            int pyear = Integer.parseInt(psplit[0]);
            int pmonth = Integer.parseInt(psplit[1]);
            int pday = Integer.parseInt(psplit[2]);
            pmonth += hm.containsKey(privacy) ? hm.get(privacy) : 0;
            int pTime = pyear * 28 * 12 + pmonth * 28 + pday;
            if(curTime >= pTime) answer.add(i + 1);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
