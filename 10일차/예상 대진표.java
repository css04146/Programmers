class Solution // 복습
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        while(match(a) != match(b)){
            a = a % 2 == 1 ? a / 2 + 1 : a / 2;
            b = b % 2 == 1 ? b / 2 + 1 : b / 2;
            answer++;
        }
        return answer;
    }
    public int match(int i){
        return i % 2 != 0 ? i + 1 : i;
    }
}
