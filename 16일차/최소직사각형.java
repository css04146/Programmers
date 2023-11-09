import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for(int[] size : sizes){
            Arrays.sort(size);
            height = Math.max(size[0], height);
            width = Math.max(size[1], width);
        }
        return height * width;
    }
}
