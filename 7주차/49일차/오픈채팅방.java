import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] record) {
        List<String> list = new ArrayList<>();
        Map<String, String> hm = new HashMap<>();
        for(String r : record){
            if(r.startsWith("Enter")) hm.put(r.split(" ")[1], r.split(" ")[2]);
            else if(r.startsWith("Change")) hm.put(r.split(" ")[1], r.split(" ")[2]);
        }
        for(String r : record){
            String[] temp = r.split(" ");
            if(temp[0].equals("Enter")) list.add(hm.get(temp[1]) + "님이 들어왔습니다.");
            else if(temp[0].equals("Leave")) list.add(hm.get(temp[1]) + "님이 나갔습니다.");
        }
        return list.toArray(new String[0]);
    }
}
