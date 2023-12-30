import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;
        Arrays.sort(citations);
        for(int i = 0; i < len; i++){
            int h_index = len - i;
            if(citations[i] >= h_index){
                answer = h_index;
                break;
            }
        }
        return answer;
    }
}
