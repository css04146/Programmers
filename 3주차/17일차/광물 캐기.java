// 복습 요
import java.util.Arrays;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        int cnt = 0;
        int answer = 0;
        int mlen = minerals.length;
        for(int p : picks) cnt += p;
        cnt = Math.min(mlen / 5 + 1, cnt);
        int[][] p = new int[cnt][3];
        for(int i = 0; i < mlen; i += 5){
            int dp = 0, ip = 0, sp = 0;
            if(i / 5 == cnt) break;
            for(int j = i; j < i + 5; j++){
                if(minerals[j].equals("diamond")){
                    dp += 1;
                    ip += 5;
                    sp += 25;
                }
                else if(minerals[j].equals("iron")){
                    dp += 1;
                    ip += 1;
                    sp += 5;
                }
                else{
                    dp += 1;
                    ip += 1;
                    sp += 1;
                }
                if(j == minerals.length - 1) break;
            }
            p[i / 5][0] = dp;
            p[i / 5][1] = ip;
            p[i / 5][2] = sp;
        }
        Arrays.sort(p, (o1, o2) -> o2[2] - o1[2]);
        for(int i = 0; i < cnt; i++){
            if(picks[0] != 0){
                answer += p[i][0];
                picks[0]--;
            }
            else if(picks[1] != 0){
                answer += p[i][1];
                picks[1]--;
            }
            else if(picks[2] != 0){
                answer += p[i][2];
                picks[2]--;
            }
        }
        return answer;
    }
}
