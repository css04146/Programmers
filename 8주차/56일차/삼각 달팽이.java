class Solution {
    public int[] solution(int n) {
        int x = -1, y = 0;
        int idx = 1, k = 0;
        int len = n * (n + 1) / 2;
        int[] answer = new int[len];
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i % 3 == 0) ++x;
                else if(i % 3 == 1) ++y;
                else{
                    --x;
                    --y;
                }
                arr[x][y] = idx++;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0) break;
                answer[k++] = arr[i][j];
            }
        }
        return answer;
    }
}
