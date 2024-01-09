class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int[] answer = new int[2];
        int left = 0, right = n, sum = 0;
        for(int l = 0, r = 0; l < n; l++){
            while(r < n && sum < k) sum += sequence[r++];
            if(sum == k){
                int len = right - left;
                if(r - l - 1 < len){
                    right = r - 1;
                    left = l;
                }
            }
            sum -= sequence[l];
        }
        answer[0] = left;
        answer[1] = right;
        return answer;
    }
}
