class Solution {
    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(String temp : s.split(" ")){
            min = Math.min(Integer.parseInt(temp), min);
            max = Math.max(Integer.parseInt(temp), max);
        }
        return min + " " + max;
    }
}
