import java.util.Set;
import java.util.HashSet;
class Solution {
    int answer = 0;
    Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        makeNum("", numbers);
        findPrime(set);
        return answer;
    }
    
    public void findPrime(Set<Integer> set){
        for(int i : set){
            if(isPrime(i)) answer++;
        }
    }
    public void makeNum(String num, String words){
        if(!num.equals("")) set.add(toi(num)); // 미리 처리하지 않으면 11과 011 같은 케이스로 인해 오답 처리가 나옴.
        for(int i = 0; i < words.length(); i++){
            makeNum(num + words.charAt(i),
                   words.substring(0, i) + words.substring(i + 1));
        }
    }
    
    public boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        double sqrt = Math.sqrt(n);
        for(int i = 2; i <= (int)sqrt; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public int toi(String s){
        return Integer.parseInt(s);
    }
}
