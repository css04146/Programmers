import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> ht = new HashMap<>(); // 누적 시간
        Map<String, Integer> hi = new HashMap<>(); // 들어온 시간
        for(String record : records){
            String[] temp = record.split(" ");
            int time = timeToInt(temp[0]);
            if(temp[2].equals("IN")){
                hi.put(temp[1], time);
            } else{
                if(!hi.containsKey(temp[1])) continue;
                int inTime = hi.get(temp[1]);
                int totalTime = time - inTime;
                ht.put(temp[1], ht.getOrDefault(temp[1], 0) + totalTime);
                hi.remove(temp[1]);
            }
        }
        for(String s : hi.keySet()){
            int time = 23 * 60 + 59;
            int inTime = hi.get(s);
            time -= inTime;
            ht.put(s, ht.getOrDefault(s, 0) + time);
        }
        for(String s : ht.keySet()){
            int time = ht.get(s); // 총 시간
            if(time > fees[0]){
                int rTime = time - fees[0];
                double aValue = Math.ceil(rTime / (double)fees[2]);
                int totalValue = (int)(aValue * fees[3]);
                ht.put(s, fees[1] + totalValue);
            } else ht.put(s, fees[1]);
        }
        List<String> list = new ArrayList<>(ht.keySet());
        Collections.sort(list);
        int[] answer = new int[ht.size()];
        for(int i = 0; i < ht.size(); i++){
            answer[i] = ht.get(list.get(i));
        }
        return answer;
    }
    public int timeToInt(String s){
        String[] temp = s.split("\\:");
        int hour = Integer.parseInt(temp[0]);
        int minute = Integer.parseInt(temp[1]);
        return hour * 60 + minute;
    }
}
