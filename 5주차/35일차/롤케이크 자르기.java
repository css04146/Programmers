import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int len = topping.length;
        
        int[] topping1 = new int[len];
        int[] topping2 = new int[len];
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int i = 0; i < len; i++){
            set1.add(topping[i]);
            topping1[i] = set1.size();
        }
        
        for(int j = len - 1; j >= 0; j--){
            set2.add(topping[j]);
            topping2[j] = set2.size();
        }
        
        for(int i = 0; i < len - 1; i++){
            if(topping1[i] == topping2[i + 1]) answer++;
        }
        
        return answer;
    }
}
