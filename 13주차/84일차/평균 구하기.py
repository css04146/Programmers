import java.util.*;
class Solution {
    public double solution(int[] arr) {
        return (double)Arrays.stream(arr).sum() / arr.length;
    }
}
/**********************************************************************/
import java.util.*;
class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
/* 파이썬
def solution(arr):
    answer = 0
    for i in arr:
        answer += i
    return answer / len(arr)
*/
