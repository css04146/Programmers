// char 배열로 정렬을 생각하지 못해서 내일 다시 복습
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(String i : str) sb.append(i);
        return sb.toString();
    }
}
