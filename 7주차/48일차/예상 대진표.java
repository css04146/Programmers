class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        while(even(a) != even(b)){
            a = even(a) / 2;
            b = even(b) / 2;
            answer++;
        }
        return answer;
    }
    public int even(int n){
        return n % 2 == 0 ? n : n + 1;
    }
}
