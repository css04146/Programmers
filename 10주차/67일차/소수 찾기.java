import java.util.Set;
import java.util.HashSet;
class Solution {
    Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        makeNumber("", numbers);
        for(int n : set) if(isPrime(n)) answer++;
        return answer;
    }
    public void makeNumber(String word, String numbers){
        if(!word.equals("")) set.add(Integer.parseInt(word));
        for(int i = 0; i < numbers.length(); i++){
            makeNumber(word + numbers.charAt(i),
            numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }
    public boolean isPrime(int n){
        double sqrt = Math.sqrt(n);
        if(sqrt == (int)sqrt) return false;
        for(int i = 2; i <= (int)sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
