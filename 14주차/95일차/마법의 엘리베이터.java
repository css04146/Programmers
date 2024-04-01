class Solution {
    public int solution(int storey) {
        int rest;
        int n = 10;
        int answer = 0;
        while(storey != 0){
            rest = storey % n;
            if(rest > 5){
                rest = n - rest;
                answer += rest;
                storey += n;
            } else if(rest == 5){
                int digit = storey / n % 10;
                if(digit >= 5){
                    storey += n;
                    rest = n - rest;
                    answer += rest;
                } else answer += rest;
            } else answer += rest;
            storey -= rest;
            storey /= n;
        }
        return answer;
    }
}
