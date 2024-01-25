// else continue의 유무가 불가를 갈랐음.
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(completion);
        Arrays.sort(participant);
        for(int i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
            else continue;
        }
        return participant[participant.length - 1];
    }
}
