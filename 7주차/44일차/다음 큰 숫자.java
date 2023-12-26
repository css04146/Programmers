class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = Integer.toBinaryString(n);
        temp = temp.replace("0", "");
        int len = temp.length();
        while(true){
            temp = Integer.toBinaryString(++n);
            temp = temp.replace("0", "");
            if(len == temp.length()) break;
        }
        return n;
    }
}
