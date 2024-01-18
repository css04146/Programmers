class Solution {
    public int solution(String word) {
        String str = "AEIOU";
        int answer = word.length();
        int[] idx = {781, 156, 31, 6 , 1};
        for(int i = 0; i < word.length(); i++){
            int j = str.indexOf(word.charAt(i));
            answer += j * idx[i];
        }
        return answer;
    }
}
