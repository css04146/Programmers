import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        for(String string : strings) list.add(string);
        list.sort((o1, o2) -> {
            if(o1.charAt(n) < o2.charAt(n)) return -1;
            else if(o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
            else return 1;
        });
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}
