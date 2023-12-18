import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] record) {
        List<String> list = new ArrayList<>();
        Map<String, String> hm = new HashMap<>();
        
        for(String r : record){
            String[] temp = r.split(" ");
            if(temp[0].equals("Enter") || temp[0].equals("Change")){
                hm.put(temp[1], temp[2]);
            }
        }
        
        for(String r : record){
            String[] temp = r.split(" ");
            if(temp[0].equals("Enter")){
                list.add(hm.get(temp[1]) + "님이 들어왔습니다.");
            } else if(temp[0].equals("Leave")){
                list.add(hm.get(temp[1]) + "님이 나갔습니다.");
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
