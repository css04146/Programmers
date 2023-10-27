// if문 안쓰고 풀어보고 싶어서 다시 풀어봄
import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n != 0){
            ans = n % 2 == 0 ? ans : ans + 1;
            n = n % 2 == 0 ? n / 2 : n - 1;
        }
        return ans;
    }
}
