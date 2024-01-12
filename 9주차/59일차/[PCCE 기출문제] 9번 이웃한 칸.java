class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int height = board.length;
        int width = board[0].length;
        String temp = board[h][w];
        if(h - 1 >= 0 && temp.equals(board[h - 1][w])) answer++;
        if(h + 1 < height && temp.equals(board[h + 1][w])) answer++;
        if(w - 1 >= 0 && temp.equals(board[h][w - 1])) answer++;
        if(w + 1 < width && temp.equals(board[h][w + 1])) answer++;
        return answer;
    }
}
