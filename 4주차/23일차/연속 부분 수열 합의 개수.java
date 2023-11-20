import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < len; i++){
            for(int size = 1; size <= len; size++){
                int sum = 0;
                for(int j = i; j < i + size; j++){
                    sum += elements[j % len];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}
