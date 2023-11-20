import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public int[] solution(String msg) {
        int index = 1;
        Map<String, Integer> hm = new HashMap<>();
        for(char c = 'A'; c <= 'Z'; c++){
            hm.put(String.valueOf(c), index++);
        }
        int idx = 0;
        List<Integer> list = new ArrayList<>();
        while(idx < msg.length()){
            String temp = "";
            while(idx < msg.length()){
                if(!hm.containsKey(temp + msg.charAt(idx))) break;
                else temp += msg.charAt(idx++);
            }
            list.add(hm.get(temp));
            if(idx < msg.length()){
                hm.put(temp + msg.charAt(idx), index++);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
//
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(String msg) {
        List<String> dict = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        for(char c = 'A'; c <= 'Z'; c++) dict.add(String.valueOf(c));
        for(int i = 0; i < msg.length(); i++){
            String temp = msg.substring(i);
            for(int j = dict.size() - 1; j >= 0; j--){
                if(temp.startsWith(dict.get(j))){
                    result.add(j + 1);
                    i += dict.get(j).length() - 1;
                    if(i + 1 < msg.length()) dict.add(dict.get(j) + msg.charAt(i + 1));
                    break;
                }
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}
