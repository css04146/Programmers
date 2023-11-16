import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(String s) {
        s = s.replace("{{", "");
        s = s.replace("}}", "");
        s = s.replace("},{", "-");
        String[] str = s.split("-");
        int[] answer = new int[str.length];
        List<String> list = new ArrayList<>();
        Arrays.sort(str, (o1, o2) -> o1.length() - o2.length());
        for(String t : str){
            String[] temp = t.split(",");
            for(String p : temp){
                if(!list.contains(p)){
                    list.add(p);
                }
            }
        }
        for(int i = 0; i < list.size(); i++) answer[i] = atoi(list.get(i));
        return answer;
    }
    public int atoi(String s){
        return Integer.parseInt(s);
    }
}
