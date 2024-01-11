class Solution {
    public long solution(int price, int money, int count) {
        long answer = count * (count + 1);
        answer = (answer / 2) * price;
        return answer > money ? answer - money : 0;
    }
}
