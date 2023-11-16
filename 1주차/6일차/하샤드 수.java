class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int d = 0;
        String n = String.valueOf(x);
        for(String i : n.split("")) d += Integer.parseInt(i);
        return x % d == 0 ? true : false;
    }
}
