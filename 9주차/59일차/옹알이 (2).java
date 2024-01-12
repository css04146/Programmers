// 복습 요망
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String b : babbling){
            if(b.contains("ayaaya")) continue;
            if(b.contains("yeye")) continue;
            if(b.contains("woowoo")) continue;
            if(b.contains("mama")) continue;
            b = b.replace("aya", " ");
            b = b.replace("ye", " ");
            b = b.replace("woo", " ");
            b = b.replace("ma", " ");
            b = b.replace(" ", "");
            if(b.equals("")) answer++;
        }
        return answer;
    }
}
