class Solution {
    int[] arr;
    int answer = 0;
    public int solution(int n) {
        arr = new int[n];
        nQueen(0, n);
        return answer;
    }
    public boolean isPossible(int col){
        for(int i = 0; i < col; i++){
            if(Math.abs(i - col) == Math.abs(arr[i] - arr[col])) return false;
            else if(arr[i] == arr[col]) return false;
        }
        return true;
    }
    public void nQueen(int depth, int n){
        if(depth == n){
            answer++;
            return;
        }
        for(int i = 0; i < n; i++){
            arr[depth] = i;
            if(isPossible(depth)){
                nQueen(depth + 1, n);
            }
        }
    }
}
