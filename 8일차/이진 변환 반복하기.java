class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")){
            int len = s.length();
            s = s.replace("0", "");
            int tlen = s.length();
            answer[0]++; answer[1] += len - tlen;
            s = Integer.toBinaryString(tlen);
        }
        return answer;
    }
}
