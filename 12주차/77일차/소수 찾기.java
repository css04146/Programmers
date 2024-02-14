import java.util.Set;
import java.util.HashSet;
class Solution {
    int answer = 0;
    Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        findNumber("", numbers);
        for(int i : set) if(isPrime(i)) answer++;
        return answer;
    }
    public void findNumber(String word, String numbers){
        if(!word.equals("")) set.add(Integer.parseInt(word));
        for(int i = 0; i < numbers.length(); i++){
            String temp = numbers.substring(0, i) + numbers.substring(i + 1);
            findNumber(word + numbers.charAt(i), temp);
        }
    }
    public boolean isPrime(int n){
        int sqrt = (int)Math.sqrt(n);
        if(n == 0 || n == 1) return false;
        for(int i = 2; i <= sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
