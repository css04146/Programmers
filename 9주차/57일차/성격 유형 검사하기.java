// 복습 요망
import java.util.Map;
import java.util.HashMap;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String rt = "R";
        String cf = "C";
        String jm = "J";
        String an = "A";
        int len = survey.length;
        Map<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < len; i++){
            if(choices[i] > 4){
                char c = survey[i].charAt(1);
                int temp = choices[i] - 4;
                hm.put(c, hm.getOrDefault(c, 0) + temp);
            } else if(choices[i] < 4){
                char c = survey[i].charAt(0);
                int temp = 4 - choices[i];
                hm.put(c, hm.getOrDefault(c, 0) + temp);
            } else continue;
        }
        if(hm.getOrDefault('R', 0) < hm.getOrDefault('T', 0)) rt = "T";
        if(hm.getOrDefault('C', 0) < hm.getOrDefault('F', 0)) cf = "F";
        if(hm.getOrDefault('J', 0) < hm.getOrDefault('M', 0)) jm = "M";
        if(hm.getOrDefault('A', 0) < hm.getOrDefault('N', 0)) an = "N";
        return rt + cf + jm + an;
    }
}
