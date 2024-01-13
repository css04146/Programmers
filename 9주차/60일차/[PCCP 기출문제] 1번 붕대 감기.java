class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int idx = 0;
        int count = 0;
        int answer = health;
        int len = attacks.length;
        len = attacks[len - 1][0];
        for(int i = 1; i <= len; i++){
            if(answer <= 0) return -1;
            answer += count == bandage[0] ? bandage[2] : 0;
            count = count == bandage[0] ? 0 : count;
            answer = answer > health ? health : answer;
            if(i == attacks[idx][0]){
                answer -= attacks[idx++][1];
                count = 0;
            } else{
                answer += bandage[1];
                count++;
            }
        }
        return answer <= 0 ? -1 : answer;
    }
}
