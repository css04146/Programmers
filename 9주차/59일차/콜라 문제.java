class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int temp1 = n % a;
            int temp2 = n / a * b;
            n = temp1 + temp2;
            answer += temp2;
        }
        return answer;
    }
}
