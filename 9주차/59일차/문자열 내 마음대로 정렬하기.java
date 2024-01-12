class Solution {
    public String[] solution(String[] strings, int n) {
        java.util.Arrays.sort(strings);
        java.util.Arrays.sort(strings, (o1, o2) -> o1.charAt(n) - o2.charAt(n));
        return strings;
    }
}
