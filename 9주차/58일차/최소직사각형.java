import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for(int[] size : sizes){
            int temp1 = Math.max(size[0], size[1]);
            int temp2 = Math.min(size[0], size[1]);
            width = Math.max(width, temp1);
            height = Math.max(height, temp2);
        }
        return height * width;
    }
}
