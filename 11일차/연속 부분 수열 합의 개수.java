// 복습
import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < elements.length; i++){
            for(int size = 0; size < elements.length; size++){
                int sum = 0;
                for(int j = i; j < size + i; j++){
                    int temp = j % elements.length;
                    sum += elements[temp];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}
