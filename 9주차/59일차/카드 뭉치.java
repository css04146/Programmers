class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        int idx1len = cards1.length;
        int idx2len = cards2.length;
        for(int i = 0; i < goal.length; i++){
            if(idx1 < idx1len && cards1[idx1].equals(goal[i])) idx1++;
            else if(idx2 < idx2len && cards2[idx2].equals(goal[i])) idx2++;
            else return "No";
        }
        return "Yes";
    }
}
