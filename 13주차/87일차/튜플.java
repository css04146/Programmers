import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
class Solution {
    public int[] solution(String s) {
        s = s.substring(2);
        s = s.substring(0, s.length() - 2);
        s = s.replace("},{", "-");
        String[] str = s.split("-");
        int[] answer = new int[str.length];
        Arrays.sort(str, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
        Set<String> set = new HashSet<>();
        for(int i = 0; i < str.length; i++){
            String[] temp = str[i].split(",");
            for(String t : temp){
                if(set.contains(t)) continue;
                else if(!set.contains(t)){
                    answer[i] = Integer.parseInt(t);
                    set.add(t);
                }
            }
        }
        return answer;
    }
}
//*******************************************************************//
import java.util.*;
class Solution {
    public int[] solution(String s) {
        s =  s.replace("},{", "-");
        s = s.replace("{{", "");
        s = s.replace("}}", "");
        String[] str = s.split("-");
        Arrays.sort(str, (o1, o2) -> {
            return o1.length() - o2.length();
        });
        List<Integer> list = new ArrayList<>();
        for(String i1 : str){
            for(String i2 : i1.split(",")){
                if(!list.contains(Integer.parseInt(i2))) list.add(Integer.parseInt(i2));
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
