import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> carIn = new HashMap<>();
        Map<String, Integer> carTime = new HashMap<>();
        
        for(String record : records){
            String[] temp = record.split(" ");
            String[] time = temp[0].split(":");
            int Time = atoi(time[0]) * 60 + atoi(time[1]);
            
            if(temp[2].equals("IN")){
                if(!carTime.containsKey(temp[1])) carTime.put(temp[1], 0);
                carIn.put(temp[1], Time);
            }
            
            else if(temp[2].equals("OUT")){
                int inTime = carIn.get(temp[1]);
                int totalTime = Time - inTime;
                
                carTime.put(temp[1], carTime.get(temp[1]) + totalTime);
                carIn.remove(temp[1]);
            }
        }
        
        for(String in : carIn.keySet()){
            int endTime = 1439;
            int inTime = carIn.get(in);
            int totalTime = endTime - inTime;
            
            carTime.put(in, carTime.get(in) + totalTime);
        }
        
        List<String> list = new ArrayList<>(carTime.keySet());
        list.sort((o1, o2) -> atoi(o1) - atoi(o2));
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            String carNumber = list.get(i);
            
            int totalTime = carTime.get(carNumber);
            if(totalTime > fees[0]){
                int plusTime = totalTime - fees[0];
                int plusFee = (int)Math.ceil(plusTime / (double)fees[2]) * fees[3];/*
                int plusFee = (int)Math.ceil(plusTime / (double)fees[2] * (double)fees[3]);*/
                // () 괄호의 영역이 대단히 중요
                answer[i] = fees[1] + plusFee;
            }
            else answer[i] = fees[1];
        }
        return answer;
    }
    
    public int atoi(String s){
        return Integer.parseInt(s);
    }
}
