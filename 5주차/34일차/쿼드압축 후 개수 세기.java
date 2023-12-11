class Solution {
    int[] answer = new int[2];
    public int[] solution(int[][] arr) {
        int size = arr.length;
        find(0, 0, arr, size);
        return answer;
    }
    public void find(int x, int y, int[][] arr, int size){
        boolean isTrue = false;
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(arr[x][y] != arr[i][j]) isTrue = true;
            }
        }
        if(!isTrue){
            answer[arr[x][y]]++;
            return;
        }
        find(x, y, arr, size / 2);
        find(x + size / 2, y, arr, size / 2);
        find(x, y + size / 2, arr, size / 2);
        find(x + size / 2, y + size / 2, arr, size / 2);
    }
}
