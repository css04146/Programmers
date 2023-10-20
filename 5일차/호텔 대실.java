// 차후에 Queue를 이용해서든 복습
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] room = new int[1450];
        for(String[] time : book_time){
            room[caltime(time[0])]++;
            room[caltime(time[1]) + 10]--;
        }
        for(int i = 1; i < 1450; i++){
            room[i] += room[i - 1];
            answer = Math.max(room[i], answer);
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
