class Solution {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        dungeon(k, 0, dungeons);
        return answer;
    }
    public void dungeon(int k, int count, int[][] dungeons){
        answer = Math.max(count, answer);
        if(k > 0){
            for(int i = 0; i < dungeons.length; i++){
                if(k >= dungeons[i][0]){
                    int temp = dungeons[i][0];
                    dungeons[i][0] = Integer.MAX_VALUE;
                    dungeon(k - dungeons[i][1], count + 1, dungeons);
                    dungeons[i][0] = temp;
                }
            }
        }
    }
}
