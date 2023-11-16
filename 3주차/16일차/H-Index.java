import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int len = citations.length;
        for(int i = 0; i < len; i++){
            int h_index = len - i;
            if(h_index <= citations[i]){
                return h_index;
            }
        }
        return answer;
    }
}
