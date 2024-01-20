// 절대 정답 아니고 시간 초과 뜨긴 하지만 이런 방식도 있다하는 저장용
// 복습 요망
class Solution {
    int max = 0;
    public String solution(String number, int k) {
        int len = number.length() - k;
        findNumber("", number, len);
        return String.valueOf(max);
    }
    public void findNumber(String number, String word, int k){
        if(number.length() == k){
            int n = Integer.parseInt(number);
            if(n > max) max = n;
            return;
        }
        for(int i = 0; i < word.length(); i++){
            findNumber(number + word.charAt(i),
            word.substring(i + 1), k);
        }
    }
}
