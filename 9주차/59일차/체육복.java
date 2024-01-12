// 복습 요망
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] arr = new int[n];
        for(int l : lost) arr[l - 1]--;
        for(int r : reserve) arr[r - 1]++;
        for(int i = 0; i < n; i++){
            if(arr[i] == -1){
                if(i - 1 >= 0 && arr[i - 1] > 0){
                    arr[i - 1]--;
                    arr[i]++;
                }
                else if(i + 1 < n && arr[i + 1] > 0){
                    arr[i + 1]--;
                    arr[i]++;
                }
                else answer--;
            }
        }
        return answer;
    }
}
