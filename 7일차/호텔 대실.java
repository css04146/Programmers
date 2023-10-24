class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] book = new int[1450];
        for(String[] time : book_time){
            int start = caltime(time[0]);
            int end = caltime(time[1]);
            book[start]++; book[end + 10]--; // 자꾸 end + 10을 놓침...
        }
        for(int i = 1; i < 1440; i++){
            book[i] += book[i - 1];
            answer = Math.max(book[i], answer);
        }
        return answer;
    }
    public int caltime(String s){
        String[] temp = s.split(":");
        int hour = Integer.parseInt(temp[0]);
        int minute = Integer.parseInt(temp[1]);
        return hour * 60 + minute;
    }
}
