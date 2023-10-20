// 다른 버전으로 풀어보기
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();
        for(String string : strings) list.add(string);
        list.sort(new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.charAt(n) < s2.charAt(n)) return -1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else return 1;
            }
        });
        String[] answer = new String[strings.length];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}
