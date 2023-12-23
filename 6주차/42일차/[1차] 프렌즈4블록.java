import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] table = trans(m, n, board);
        Set<int[]> set = findBlock(m, n, table);
        while(!set.isEmpty()){
            table = removeBlock(set, table);
            table = transBlock(table, m, n);
            set = findBlock(m, n, table);
        }
        return find0Block(table, m, n);
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
    public char[][] transBlock(char[][] table, int m, int n){
        for(int i = 0; i < n; i++){
            List<Character> list = new ArrayList<>();
            for(int j = 0; j < m; j++) if(table[j][i] != '-') list.add(table[j][i]);
            for(int j = m - 1; j >= 0; j--){
                if(list.isEmpty()) table[j][i] = '-';
                else table[j][i] = list.remove(list.size() - 1);
            }
        }
        return table;
    }
    public char[][] removeBlock(Set<int[]> set, char[][] table){
        for(int[] temp : set) table[temp[0]][temp[1]] = '-';
        return table;
    }
    public boolean isBlock(int m, int n, char[][] table){
        if(table[m][n] != table[m + 1][n]) return false;
        if(table[m][n] != table[m][n + 1]) return false;
        if(table[m][n] != table[m + 1][n + 1]) return false;
        return true;
    }
    public Set<int[]> findBlock(int m, int n, char[][] table){
        Set<int[]> set = new HashSet<>();
        for(int i = 0; i < m - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if(table[i][j] == '-') continue;
                if(isBlock(i, j, table)){
                    set.add(new int[]{i, j});
                    set.add(new int[]{i + 1, j});
                    set.add(new int[]{i, j + 1});
                    set.add(new int[]{i + 1, j + 1});
                }
            }
        }
        return set;
    }
    public char[][] trans(int m, int n, String[] board){
        char[][] temp = new char[m][n];
        for(int i = 0; i < m; i++) temp[i] = board[i].toCharArray();
        return temp;
    }
}
