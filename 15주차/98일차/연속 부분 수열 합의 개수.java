import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int size = elements.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                int sum = 0; // j는 idx 확인용
                for(int k = j; k < i + j; k++){
                    sum += elements[k % size];
                }
                hs.add(sum);
            }
        }
        return hs.size();
    }
}
