// 해결 못함...
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String[] solution(String[] orders, int[] course) {
        List<String> list = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        List<String> menu = Arrays.asList(orders);
        Map<String, Integer> hm = new HashMap<>();
        for(int c : course) num.add(c);
        for(int i = 0; i < orders.length; i++){
            for(int j = 0; j < orders.length; j++){
                if(i == j) continue;
                String temp = "";
                List<Character> list1 = new ArrayList<>();
                List<Character> list2 = new ArrayList<>();
                for(char c : orders[i].toCharArray()) list1.add(c);
                for(char c : orders[j].toCharArray()) list2.add(c);
                Collections.sort(list1);
                Collections.sort(list2);
                for(char c1 : list1){
                    for(char c2 : list2){
                        if(c1 == c2) temp += c1; 
                    }
                }
                if(num.contains(temp.length())) hm.put(temp, hm.getOrDefault(temp, 1) + 1);
            }
        }
        for(String key : hm.keySet()){
            if(num.contains(key.length())){
                if(menu.contains(key)){
                    if(hm.get(key) > 2) list.add(key);
                }
                else list.add(key);
            }
        }
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
}
