import java.util.Arrays;
class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new StringBuilder().append(n).chars().map(Character::getNumericValue).toArray();
        Arrays.sort(arr);
        for(int i = arr.length - 1; i >= 0; i--) sb.append(arr[i]);
        return Long.parseLong(sb.toString());
    }
}
