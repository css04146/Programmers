class Solution {
    public int solution(int storey) {
        int answer = 0;
        while(storey > 0){
            int j = storey % 10; // 자릿수대 나머지
            int nj = (storey / 10) % 10;
            if(j > 5){
                storey += 10;
                answer += 10 - j;
            } else if(j == 5){
                if(nj > 4) storey += 10;
                answer += 5;
            } else answer += j;
            storey /= 10;
        }
        return answer;
    }
    public String tos(int n){
        return String.valueOf(n);
    }
}
