import java.util.*;
class Solution {
    public int[] solution(String msg) {
        int idx = 0;
        int character_idx = 1;
        Map<String, Integer> hm = new HashMap<>();
        for(char c = 'A'; c <= 'Z'; c++) hm.put(tos(c), character_idx++); 
        List<Integer> list = new ArrayList<>();
        while(idx < msg.length()){
            String temp = "";
            while(idx < msg.length()){
                if(hm.containsKey(temp + msg.charAt(idx))) temp += msg.charAt(idx++);
                else break;
            }
            list.add(hm.get(temp));
            if(idx < msg.length()){
                hm.put(temp + msg.charAt(idx), character_idx++);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
    public String tos(char c){
        return String.valueOf(c);
    }
}
