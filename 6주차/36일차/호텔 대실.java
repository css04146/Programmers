class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] book = new int[1450];
        for(String[] time : book_time){
            int start = atoi(time[0]);
            int end = atoi(time[1]) + 10;
            for(int i = start; i < end; i++){
                book[i]++;
            }
        }
        for(int i : book){
            answer = Math.max(answer, i);
        }
        return answer;
    }
    public int atoi(String s){
        String[] temp = s.split(":");
        int hour = Integer.parseInt(temp[0]);
        int min = Integer.parseInt(temp[1]);
        return hour * 60 + min;
    }
}
