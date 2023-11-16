class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int card1idx = 0;
        int card2idx = 0;
        for(String g : goal){
            if(card1idx < cards1.length
            && g.equals(cards1[card1idx])) card1idx++; // idx에 관한게 먼저 나와야 성립 가능
            else if(card2idx < cards2.length
                 && g.equals(cards2[card2idx])) card2idx++;
            else return "No";
        }
        return "Yes";
    }
}
