class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")){
            int len = s.length();
            s = s.replace("0", "");
            int tlen = s.length();
            s = Integer.toString(tlen, 2);
            answer[1] += (len - tlen);
            answer[0]++;
        }
        return answer;
    }
}
