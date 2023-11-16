// 복습 요
import java.util.Arrays;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int cnt = sum(picks);
        int len = minerals.length;
        cnt = Math.min(len / 5 + 1, cnt);
        int[][] p = new int[cnt][3];
        for(int i = 0; i < len; i += 5){
            if(i / 5 == cnt) break;
            int dp = 0, ip = 0, sp = 0;
            for(int j = i; j < i + 5; j++){
                if(minerals[j].equals("diamond")){
                    dp += 1; ip += 5; sp += 25;
                }
                else if(minerals[j].equals("iron")){
                    dp += 1; ip += 1; sp += 5;
                }
                else if(minerals[j].equals("stone")){
                    dp += 1; ip += 1; sp += 1;
                }
                if(j == len - 1) break;
            }
            p[i / 5][0] = dp;
            p[i / 5][1] = ip;
            p[i / 5][2] = sp;
        }
        Arrays.sort(p, (o1, o2) -> o2[2] - o1[2]);
        for(int[] i : p){
            if(picks[0] != 0){
                answer += i[0];
                picks[0]--;
            }
            else if(picks[1] != 0){
                answer += i[1];
                picks[1]--;
            }
            else if(picks[2] != 0){
                answer += i[2];
                picks[2]--;
            }
        }
        return answer;
    }
    int sum(int[] picks){
        int total = 0;
        for(int p : picks){
            total += p;
        }
        return total;
    }
}
