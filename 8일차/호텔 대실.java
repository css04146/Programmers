// 복습, 차후 다른 방법으로 풀어볼 것
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] book = new int[1450];
        for(String[] time : book_time){
            int st = caltime(time[0]);
            int en = caltime(time[1]);
            book[st]++; book[en + 10]--;
        }
        for(int i = 1; i < 1450; i++){
            book[i] += book[i - 1];
            answer = Math.max(book[i], answer);
        }
        return answer;
    }
    public int caltime(String s){
        String[] temp = s.split(":");
        int hour = Integer.parseInt(temp[0]);
        int min = Integer.parseInt(temp[1]);
        return hour * 60 + min;
    }
}
