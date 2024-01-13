class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        while(odd(a) != odd(b)){
            a = odd(a) / 2;
            b = odd(b) / 2;
            answer++;
        }
        return answer;
    }
    public int odd(int n){
        return n % 2 == 0 ? n : n + 1;
    }
}
