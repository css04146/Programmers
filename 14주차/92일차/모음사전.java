class Solution {
    public int solution(String word) {
        String str = "AEIOU";
        int answer = word.length();
        int[] idx = {781, 156, 31, 6, 1};
        for(int i = 0; i < word.length(); i++){
            String temp = String.valueOf(word.charAt(i));
            answer += str.indexOf(temp) * idx[i];
        }
        return answer;
    }
}
