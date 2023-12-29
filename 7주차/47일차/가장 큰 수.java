import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(int[] numbers) {
        int len = numbers.length;
        String[] str = new String[len];
        for(int i = 0; i < len; i++) str[i] = tos(numbers[i]);
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String s1, String s2){
                if(toi(s1 + s2) < toi(s2 + s1)) return 1;
                else return -1;
            }
        });
        String answer = "";
        for(String s : str) answer += s; 
        return answer;
    }
    public int toi(String s){
        return Integer.parseInt(s);
    }
    public String tos(int n){
        return String.valueOf(n);
    }
}
// 위에 코드는 시간 초과가 뜸.
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
        if(answer.startsWith("0")) return "0";
        return answer;
    }
    public int toi(String s){
        return Integer.parseInt(s);
    }
    public String tos(int n){
        return String.valueOf(n);
    }
}
// 해당 코드가 맞는 코드
