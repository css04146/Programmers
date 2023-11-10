// 복습 요
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(String s) {
        s = s.replace("{{", "");
        s = s.replace("}}", "");
        s = s.replace("},{", "-");
        String[] str = s.split("-");
        Arrays.sort(str, (o1, o2) -> o1.length() - o2.length());
        int[] answer = new int[str.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < str.length; i++){
            String[] temp = str[i].split(",");
            for(int j = 0; j < temp.length; j++){
                int n = Integer.parseInt(temp[j]);
                if(!list.contains(n)) list.add(n);
            }
        }
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}
