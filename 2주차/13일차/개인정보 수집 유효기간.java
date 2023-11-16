import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        String[] time = today.split("\\.");
        int year = Integer.parseInt(time[0]);
        int mon = Integer.parseInt(time[1]);
        int day = Integer.parseInt(time[2]);
        int curtime = year * 28 * 12 + mon * 28 + day;
        for(String term : terms){
            String[] temp = term.split(" ");
            hm.put(temp[0], Integer.parseInt(temp[1]));
        }
        for(int i = 0; i < privacies.length; i++){
            String[] psplit = privacies[i].split(" ");
            String[] temp = psplit[0].split("\\.");
            int pyear = Integer.parseInt(temp[0]);
            int pmon = Integer.parseInt(temp[1]);
            int pday = Integer.parseInt(temp[2]);
            int ptime = pyear * 28 * 12 + pmon * 28 + pday;
            ptime += hm.get(psplit[1]) * 28; // 파기해야 될 날짜, 달이기 때문에 28을 곱해야 한다.
            if(curtime >= ptime) list.add(i + 1);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
