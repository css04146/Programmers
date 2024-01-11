class Solution {
    int answer = 0;
    public int solution(int[] number) {
        findTriple(number, 0, 0, 0);
        return answer;
    }
    public void findTriple(int[] number, int sum, int count, int idx){
        if(count == 3){
            if(sum == 0) answer++;
            return;
        }
        for(int i = idx; i < number.length; i++){
            findTriple(number, sum + number[i], count + 1, i + 1);
        }
    }
}
