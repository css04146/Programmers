// 복습 요망
class Solution {
    int maxOfCost;
    int maxOfSubscribe;
    int[] discount = {10, 20, 30, 40};
    public int[] solution(int[][] users, int[] emoticons) {
        int len = emoticons.length;
        findResult(0, len, new int[len], users, emoticons);
        return new int[]{maxOfSubscribe, maxOfCost};
    }
    public void findResult(int idx, int len, int[] discounts, int[][] users, int[] emoticons){
        if(idx == len){
            int cost = 0;
            int subscribe = 0;
            for(int[] user : users){
                int sum = 0;
                for(int i = 0; i < discounts.length; i++){
                    if(discounts[i] >= user[0]){
                        sum += emoticons[i] / 100 * (100 - discounts[i]);
                    }
                }
                if(sum >= user[1]) subscribe++;
                else cost += sum;
            }
            if(subscribe > maxOfSubscribe){
                maxOfSubscribe = subscribe;
                maxOfCost = cost;
            }
            else if(subscribe == maxOfSubscribe) maxOfCost = Math.max(cost, maxOfCost);
            return;
        }
        for(int i = 0; i < 4; i++){
            discounts[idx] = discount[i];
            findResult(idx + 1, len, discounts, users, emoticons);
        }
    }
}
