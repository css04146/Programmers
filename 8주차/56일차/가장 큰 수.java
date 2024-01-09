import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(int[] numbers) {
        int len = numbers.length;
        String[] str = new String[len];
        for(int i = 0; i < len; i++) str[i] = tos(numbers[i]);
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                return (s2 + s1).compareTo(s1 + s2);
            }
        });
        String answer = "";
        for(String s : str) answer += s;
        return answer;
    }
    public String tos(int n){
        return String.valueOf(n);
    }
}
//
