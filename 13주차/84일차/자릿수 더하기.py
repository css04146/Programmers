def solution(n):
    answer = 0
    for i in str(n):
        answer += int(i)
    return answer

/* 다른 코드
def solution(n):
    return sum(map(int, str(n)))
*/
/* 자바
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for(String s : str.split("")) answer += Integer.parseInt(s);
        return answer;
    }
}
*/
