import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int idx = 0;
        int count = 0;
        int value = health;
        int len = attacks.length;
        int time = attacks[len - 1][0];
        for(int i = 1; i <= time; i++){
            health = health >= value ? value : health;
            if(health <= 0) break;
            if(i == attacks[idx][0]){
                health -= attacks[idx++][1];
                count = 0;
            } else{ 
                health += bandage[1];
                count++;
            }
            int multiply = count / bandage[0];
            health += multiply > 0 ? multiply * bandage[2] : 0;
        }
        return health <= 0 ? -1 : health;
    }
}
