class Solution {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        for(int i = 0; i < 4; i++){
            int cx = w + dx[i];
            int cy = h + dy[i];
            if(cx < 0 || cx >= board[0].length
            || cy < 0 || cy >= board.length) continue;
            if(board[cy][cx].equals(color)) answer++;
        }
        return answer;
    }
}
