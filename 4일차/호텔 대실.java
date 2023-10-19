class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] btime = new int[1450];
        
        for(String[] time : book_time){
            String[] startt = time[0].split(":");
            String[] endt = time[1].split(":");
            
            int starth = Integer.parseInt(startt[0]);
            int startm = Integer.parseInt(startt[1]);
            
            int endh = Integer.parseInt(endt[0]);
            int endm = Integer.parseInt(endt[1]);
            
            btime[starth * 60 + startm]++;
            btime[endh * 60 + endm + 10]--;
        }
        
        for(int i = 1; i < 1450; i++){
            btime[i] += btime[i - 1];
            answer = Math.max(answer, btime[i]);
        }
        
        return answer;
    }
}
