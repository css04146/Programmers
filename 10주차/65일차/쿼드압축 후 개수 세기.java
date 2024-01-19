// 복습 요망
class Solution {
    int[] answer = new int[2];
    public int[] solution(int[][] arr) {
        int len = arr.length;
        divide(arr, 0, 0, len);
        return answer;
    }
    public void divide(int[][] arr, int x, int y, int size){
        if(check(arr, x, y, size)){
            answer[arr[x][y]]++;
            return;
        }
        divide(arr, x, y, size / 2);
        divide(arr, x + size / 2, y, size / 2);
        divide(arr, x, y + size / 2, size / 2);
        divide(arr, x + size / 2, y + size / 2, size / 2);
    }
    public boolean check(int[][] arr, int x, int y, int size){
        boolean isDivided = true;
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(arr[x][y] != arr[i][j]) return false;
            }
        }
        return isDivided;
    }
}
