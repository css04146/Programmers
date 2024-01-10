import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int height = board.length;
        Stack<Integer> st = new Stack<>();
        for(int move : moves){
            for(int j = 0; j < height; j++){
                if(board[j][move - 1] != 0){
                    if(!st.isEmpty() && board[j][move - 1] == st.peek()){
                        answer += 2;
                        st.pop();
                    } else st.push(board[j][move - 1]);
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
