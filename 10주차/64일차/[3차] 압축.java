import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public int[] solution(String msg) {
        int idx = 0;
        String temp = "";
        int idx_string = 1;
        int len = msg.length();
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> hidx = new HashMap<>();
        for(char c = 'A'; c <= 'Z'; c++) hidx.put(tos(c), idx_string++);
        while(idx < len){
            temp = "";
            while(idx < len){
                if(!hidx.containsKey(temp + msg.charAt(idx))){
                    hidx.put(temp + msg.charAt(idx), idx_string++);
                    list.add(hidx.get(temp));
                    break;
                } else temp += msg.charAt(idx++);
            }
        }
        list.add(hidx.get(temp));
        return list.stream().mapToInt(i -> i).toArray();
    }
    public String tos(char c){
        return String.valueOf(c);
    }
}
