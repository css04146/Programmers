import java.util.Arrays;
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int max = 23 * 60 + 59;
        int[] time = new int[max + 10];
        for(String[] book : book_time){
            int time1 = bookTime(book[0]);
            int time2 = bookTime(book[1]);
            for(int i = time1; i < time2 + 10; i++){
                time[i]++;
            }
        }
        Arrays.sort(time);
        return time[time.length - 1];
    }
    public int bookTime(String s){
        String[] temp = s.split(":");
        int time1 = Integer.parseInt(temp[0]);
        int time2 = Integer.parseInt(temp[1]);
        return time1 * 60 + time2;
    }
}
