import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        int idx = 1;
        int x = -1, y = 0;
        int[][] arr = new int[n][n];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i % 3 == 2){
                    x--; y--;
                } else if(i % 3 == 1) y++;
                else x++;
                arr[x][y] = idx++;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0) break;
                list.add(arr[i][j]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
