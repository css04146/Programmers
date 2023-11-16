import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int[] t1 = new int[topping.length];
        int[] t2 = new int[topping.length + 1];
        for(int i = 0, j = topping.length - 1; i < topping.length; i++, j--){
            set1.add(topping[i]); set2.add(topping[j]);
            t1[i] = set1.size(); t2[j] = set2.size();
        }
        for(int i = 0; i < topping.length; i++){
            if(t1[i] == t2[i + 1]) answer++;
        }
        return answer;
    }
}
