class Solution {
    int[] arr;
    int answer = 0;
    public int solution(int n) {
        arr = new int[n];
        nQueen(arr, 0, n);
        return answer;
    }
    public void nQueen(int[] arr, int depth, int n){
        if(depth == n){
            answer++;
            return;
        }
        for(int i = 0; i < arr.length; i++){
            arr[depth] = i;
            if(isPossible(depth, arr)){
                nQueen(arr, depth + 1, n);
            }
        }
    }
    public boolean isPossible(int col, int[] arr){
        for(int i = 0; i < col; i++){
            if(arr[i] == arr[col]) return false;
            if(Math.abs(i - col) == Math.abs(arr[i] - arr[col])) return false;
        }
        return true;
    }
}
