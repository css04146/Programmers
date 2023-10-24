import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int n, int m, int[] section) {
        int sum = 0;
        int answer = 0;
        for(int s : section){
            if(s < sum) continue;
            sum = s;
            sum += m;
            answer++;
        }
        return answer;
    }
}
