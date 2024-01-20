import java.util.Arrays;
class Solution {
    public int solution(int x, int y, int n) {
        int[] arr = new int[y + 1];
        Arrays.fill(arr, y);
        arr[x] = 0;
        for(int i = x; i <= y; i++){
            if(i + n <= y) arr[i + n] = Math.min(arr[i] + 1, arr[i + n]);
            if(i * 2 <= y) arr[i * 2] = Math.min(arr[i] + 1, arr[i * 2]);
            if(i * 3 <= y) arr[i * 3] = Math.min(arr[i] + 1, arr[i * 3]);
        }
        int answer = arr[y];
        answer = answer == y ? -1 : answer;
        return answer;
    }
}
