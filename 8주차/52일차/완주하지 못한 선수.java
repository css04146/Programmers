import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(completion);
        Arrays.sort(participant);
        int len = participant.length;
        for(int i = 0; i < len - 1; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[len - 1];
    }
}
