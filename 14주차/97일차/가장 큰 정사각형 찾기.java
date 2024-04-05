class Solution
{
    int answer = 0;
    public int solution(int [][]board)
    {
        int height = board.length;
        int width = board[0].length;
        if(height < 2 || width < 2) return 1;
        for(int i = 1; i < height; i++){
            for(int j = 1; j < width; j++){
                if(board[i][j] == 1){
                    board[i][j] = Math.min(board[i - 1][j],
                    Math.min(board[i][j - 1], board[i - 1][j - 1])) + 1;
                }
                answer = Math.max(answer, board[i][j]);
            }
        }
        return (int)(Math.pow(answer, 2));
    }
}
