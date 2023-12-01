import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
class Solution {
    int[] dx = {1, 1, 0};
    int[] dy = {0, 1, 1};
    
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] table = transBlock(m, n, board);
        Set<int[]> set = findBlock(m, n, table);
        while(!set.isEmpty()){
            table = removeBlock(set, table, m, n);
            table = transBlock(table, m, n);
            set = findBlock(m, n, table);
        }
        answer = find0Block(table, m, n);
        return answer;
    }
    
    public char[][] transBlock(char[][] table, int m, int n){
        for(int i = 0; i < n; i++){
            List<Character> list = new ArrayList<>();
            for(int j = 0; j < m; j++){
                if(table[j][i] != '-') list.add(table[j][i]);
            }
            for(int j = m - 1; j >= 0; j--){
                if(list.isEmpty()) table[j][i] = '-';
                else table[j][i] = list.remove(list.size() - 1);
            }
        }
        return table;
    }
    
    public int find0Block(char[][] table, int m, int n){
        int answer = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(table[i][j] == '-') answer++;
            }
        }
        return answer;
    }
    
    public char[][] removeBlock(Set<int[]> set, char[][] table, int m, int n){
        for(int[] temp : set) table[temp[1]][temp[0]] = '-';
        return table;
    }
    
    public Set addSet(int y, int x, char[][] table, Set<int[]> set){
        char temp = table[y][x];
        if(temp == '-') return set;
        for(int i = 0; i < 3; i++){
            int cy = y + dy[i];
            int cx = x + dx[i];
            if(table[cy][cx] != temp) return set;
        }
        set.add(new int[]{x, y});
        set.add(new int[]{x + 1, y});
        set.add(new int[]{x, y + 1});
        set.add(new int[]{x + 1, y + 1});
        return set;
    }
    
    public Set findBlock(int m, int n, char[][] table){
        Set<int[]> set = new HashSet<>();
        for(int i = 0; i < m - 1; i++){
            for(int j = 0; j < n - 1; j++) set = addSet(i, j, table, set);
        }
        return set;
    }
    
    public char[][] transBlock(int m, int n, String[] board){
        char[][] temp = new char[m][n];
        for(int i = 0; i < m; i++) temp[i] = board[i].toCharArray();
        return temp;
    }
}
