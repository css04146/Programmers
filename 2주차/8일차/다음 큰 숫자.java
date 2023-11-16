class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = bin(n++);
        s = s.replace("0", "");
        int len = s.length();
        for(int i = n; i < 1000000; i++){
            s = bin(i); s = s.replace("0", "");
            if(s.length() == len) return i;
        }
        return -1;
    }
    public String bin(int n){
        return Integer.toBinaryString(n);
    }
}
