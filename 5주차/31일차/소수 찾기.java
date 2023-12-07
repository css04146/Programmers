// 복습 요
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
class Solution {
    Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        recursive("", numbers);
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) if(isPrime(iter.next())) answer++;
        return answer;
    }
    public void recursive(String comb, String others){
        if(!comb.equals("")) set.add(Integer.parseInt(comb));
        for(int i = 0; i < others.length(); i++){
            recursive(comb + others.charAt(i),
                      others.substring(0, i) + others.substring(i + 1));
        }
    }
    public boolean isPrime(int n){
        double sqrt = Math.sqrt(n);
        if(n == 0 || n == 1) return false;
        for(int i = 2; i <= (int)sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
