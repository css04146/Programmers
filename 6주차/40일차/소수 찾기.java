import java.util.Set;
import java.util.HashSet;
class Solution {
    int answer = 0;
    Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        findNumber("", numbers);
        findAllPrime();
        return answer;
    }
    
    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true; // for문에서 sqrt가 2보다 작으면 생략되서 true 나오는 듯
        double sqrt = Math.sqrt(n);
        for(int i = 2; i <= (int)sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public void findAllPrime(){
        for(int i : set){
            if(isPrime(i)) answer++;
        }
    }
    
    public void findNumber(String number, String word){
        if(!number.equals("")) set.add(Integer.parseInt(number));
        for(int i = 0; i < word.length(); i++){
            findNumber(number + word.charAt(i),
            word.substring(0, i) + word.substring(i + 1));
        }
    }
}
