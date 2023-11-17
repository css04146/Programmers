class Solution {
    int solution(int[][] land) {
        int l = land.length - 1;
        for(int i = 1; i < land.length; i++){
            land[i][0] += max(max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += max(max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += max(max(land[i - 1][0], land[i - 1][1]), land[i - 1][3]);
            land[i][3] += max(max(land[i - 1][0], land[i - 1][1]), land[i - 1][2]);
        }
        return max(max(land[l][0], land[l][1]), max(land[l][2], land[l][3]));
    }
    public int max(int a, int b){
        return Math.max(a, b);
    }
}
