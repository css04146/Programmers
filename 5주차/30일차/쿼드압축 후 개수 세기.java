// 반드시 복습
class Solution {
    int[] answer = new int[2];
    public int[] solution(int[][] arr) {
        int size = arr.length;
        dp(0, 0, size, arr);
        return answer;
    }
    public void dp(int x, int y, int size, int[][] arr){
        if(check(x, y, size, arr)){
            answer[arr[x][y]]++;
            return;
        }
        dp(x, y, size / 2, arr);
        dp(x + size / 2, y, size / 2, arr);
        dp(x, y + size / 2, size / 2, arr);
        dp(x + size / 2, y + size / 2, size / 2, arr);
    }
    
    public boolean check(int x, int y, int size, int[][] arr){
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(arr[i][j] != arr[x][y]) return false;
            }
        }
        return true;
    }
}
