import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        int len = numbers.length;
        String[] str = new String[len];
        for(int i = 0; i < len; i++) str[i] = tos(numbers[i]);
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                return (s2 + s1).compareTo(s1 + s2);
            }
        });
        if(str[0].equals("0")) return "0";
        for(String s : str) answer += s;
        return answer;
    }
    public String tos(int n){
        return String.valueOf(n);
    }
}
