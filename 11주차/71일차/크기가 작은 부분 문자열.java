class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tlen = t.length();
        int plen = p.length();
        for(int i = 0; i <= tlen - plen; i++){
            if(t.substring(i, i + plen).compareTo(p) <= 0) answer++;
        }
        return answer;
    }
}
