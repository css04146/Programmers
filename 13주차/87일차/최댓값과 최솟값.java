class Solution {
    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(String i : s.split(" ")){
            min = Math.min(Integer.parseInt(i), min);
            max = Math.max(Integer.parseInt(i), max);
        }
        return min + " " + max;
    }
}
/* 파이썬
  def solution(s):
    s = list(map(int, s.split()))
    return str(min(s)) + " " + str(max(s))
*/
