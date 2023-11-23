class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int count = 0;
        int index = 0;
        int answer = health;
        int len = attacks[attacks.length - 1][0];
        
        for(int i = 1; i <= len; i++){
            if(answer <= 0) break;
            if(attacks[index][0] != i){
                answer += bandage[1];
                count++;
                if(count == bandage[0]){
                    answer += bandage[2];
                    count = 0;
                }
                answer = health < answer ? health : answer;
            }
            else if(attacks[index][0] == i){
                answer -= attacks[index++][1];
                count = 0;
            }
        }
        
        return answer <= 0 ? -1 : answer;
    }
}
