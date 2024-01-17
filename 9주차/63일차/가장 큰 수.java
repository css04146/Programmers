import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        int len = numbers.length;
        String[] str = new String[len];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++) str[i] = tos(numbers[i]);
        Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        for(String s : str) sb.append(s);
        String answer = sb.toString();
        return answer.startsWith("0") ? "0" : answer;
    }
    public String tos(int n){
        return String.valueOf(n);
    }
    public int toi(String s){
        return Integer.parseInt(s);
    }
}
