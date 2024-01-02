class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int height = arr1.length;
        int width = arr2[0].length;
        int[][] answer = new int[height][width];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < arr1[0].length; j++){
                for(int k = 0; k < width; k++){
                    answer[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }
        return answer;
    }
}
