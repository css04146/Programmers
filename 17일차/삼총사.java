class Solution {
    int len;
    int answer = 0;
    boolean[] visit;
    public int solution(int[] number) {
        len = number.length;
        visit = new boolean[len];
        bfs(0, number);
        return answer;
    }
    void bfs(int start, int[] number){
        int sum = 0;
        int index = 0;
        for(int i = 0; i < len; i++){
            if(visit[i]){
                index++;
                sum += number[i];
            }
        }
        if(index == 3 && sum == 0) answer++;
        for(int i = start; i < len; i++){
            visit[i] = true;
            bfs(i + 1, number);
            visit[i] = false;
        }
    }
}
