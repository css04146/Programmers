import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        s = s.replace("},{", "-");
        s = s.replace("{{", "");
        s = s.replace("}}", "");
        String[] temp = s.split("-");
        Arrays.sort(temp, (o1, o2) -> o1.length() - o2.length());
        for(String str : temp){
            for(String t : str.split(",")){
                int n = Integer.parseInt(t);
                if(!list.contains(n)) list.add(n);    
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
