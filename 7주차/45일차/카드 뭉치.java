class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1idx = 0;
        int card2idx = 0;
        int len1 = cards1.length;
        int len2 = cards2.length;
        for(int i = 0; i < goal.length; i++){
            if(card1idx < len1 && cards1[card1idx].equals(goal[i])) card1idx++;
            else if(card2idx < len2 && cards2[card2idx].equals(goal[i])) card2idx++;
            else return "No";
        }
        return "Yes";
    }
}
