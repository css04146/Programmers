class Solution {
    int solution(int[][] land) {
        int len = land.length - 1;
        for(int i = 1; i < land.length; i++){
            land[i][0] += max(land[i - 1][1], land[i - 1][2], land[i - 1][3]);
            land[i][1] += max(land[i - 1][0], land[i - 1][2], land[i - 1][3]);
            land[i][2] += max(land[i - 1][0], land[i - 1][1], land[i - 1][3]);
            land[i][3] += max(land[i - 1][0], land[i - 1][1], land[i - 1][2]);
        }
        return Math.max(land[len][0], max(land[len][1], land[len][2], land[len][3]));
    }
    public int max(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }
}
