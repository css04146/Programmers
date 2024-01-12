import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        return answer > set.size() ? set.size() : answer;
    }
}
