import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(String i : tos(n).split("")) answer += Integer.parseInt(i);
        return answer;
    }
    public String tos(int n){
        return String.valueOf(n);
    }
}
