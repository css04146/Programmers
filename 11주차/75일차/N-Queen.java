class Solution {
    int[] arr;
    int answer = 0;
    public int solution(int n) {
        arr = new int[n];
        nQueen(0, n, arr);
        return answer;
    }
    public void nQueen(int depth, int n, int[] arr){
        if(depth == n){
            answer++;
            return;
        }
        for(int i = 0; i < n; i++){
            arr[depth] = i;
            if(Possible(depth, arr)){
                nQueen(depth + 1, n, arr);
            }
        }
    }
    public boolean Possible(int col, int[] arr){
        for(int i = 0; i < col; i++){
            if(Math.abs(i - col) == Math.abs(arr[i] - arr[col])) return false;
            if(arr[i] == arr[col]) return false;
        }
        return true;
    }
}
