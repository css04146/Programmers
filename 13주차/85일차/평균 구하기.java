import java.util.*;
class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
/* 파이썬
def solution(arr):
    return sum(i for i in arr) / len(arr)
*/
