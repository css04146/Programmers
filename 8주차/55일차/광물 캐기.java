// 복습 요망
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        int cnt = 0;
        int answer = 0;
        int len = minerals.length;
        for(int p : picks) cnt += p;
        cnt = Math.min(cnt, len / 5 + 1);
        int[][] mineral_pick = new int[len][3];
        for(int i = 0; i < minerals.length; i += 5){
            if(i / 5 == cnt) break;
            for(int j = i; j < i + 5; j++){
                if(minerals[j].equals("diamond")){
                    mineral_pick[i][0] += 1;
                    mineral_pick[i][1] += 5;
                    mineral_pick[i][2] += 25;
                } else if(minerals[j].equals("iron")){
                    mineral_pick[i][0] += 1;
                    mineral_pick[i][1] += 1;
                    mineral_pick[i][2] += 5;
                } else{
                    mineral_pick[i][0] += 1;
                    mineral_pick[i][1] += 1;
                    mineral_pick[i][2] += 1;
                }
                if(j == minerals.length - 1) break;
            }
        }
        Arrays.sort(mineral_pick, new Comparator<int[]>(){
            public int compare(int[] n1, int[] n2){
                return n2[2] - n1[2];
            }
        });
        for(int i = 0; i < cnt; i++){
            int[] mineral = mineral_pick[i];
            if(picks[0] != 0){
                answer += mineral[0];
                picks[0]--;
            } else if(picks[1] != 0){
                answer += mineral[1];
                picks[1]--;
            } else{
                answer += mineral[2];
                picks[2]--;
            }
        }
        return answer;
    }
}
