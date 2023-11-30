// transBlock만 처리하면 될 듯
import java.util.List;
import java.util.ArrayList;
class Solution {
    int[] dx = {1, 1, 0, 0};
    int[] dy = {0, 1, 1, 0};
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] table = trans(m, n, board);
        List<int[]> list = findTable(m, n, table);
        while(!list.isEmpty()){ // 지울 블록이 있을 때까지 계속
            table = removeBlock(list, table);
            table = transBlock(m, n, table);
            list = findTable(m, n, table);
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(table[i][j] == '0') answer++;
            }
        }
        return answer;
    }
    
    public char[][] removeBlock(List<int[]> list, char[][] table){
        for(int[] temp : list){
            int y = temp[0];
            int x = temp[1];
            for(int i = 0; i < 4; i++){
                int cy = y + dy[i];
                int cx = x + dx[i];
                table[cy][cx] = '0';
            }
        }
        return table;
    }
    
    public char[][] transBlock(int m, int n, char[][] table){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(table[i][j] == '0'){
                    
                }
            }
        }
        return table;
    }
    
    public List findTable(int m, int n, char[][] table){
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < m - 1; i++){ // y축
            for(int j = 0; j < n - 1; j++){ // x축
                char temp = table[i][j];
                if(temp == '0') continue;
                boolean isBlock = true; // block이 있는지 초기화
                for(int k = 0; k < 3; k++){
                    int cy = i + dy[k]; // y축
                    int cx = j + dx[k]; // x축
                    if(table[cy][cx] != temp) isBlock = false;
                }
                if(isBlock) list.add(new int[]{i, j});
            }
        }
        return list;
    }
    
    public char[][] trans(int m, int n, String[] board){
        char[][] temp = new char[m][n]; // 임시로 사용할 2차원 배열
        for(int i = 0; i < m; i++) temp[i] = board[i].toCharArray();
        return temp; // 2차원 배열 반환
    }
}
