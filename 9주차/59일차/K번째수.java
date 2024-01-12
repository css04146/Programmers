class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int idx = 0;
        int[] answer = new int[commands.length];
        for(int[] command : commands){
            int len = command[1] - command[0] + 1;
            int[] temp = new int[len];
            for(int i = 0; i < temp.length; i++){
                temp[i] = array[command[0] -1 + i];
            }
            java.util.Arrays.sort(temp);
            answer[idx++] = temp[command[2] - 1];
        }
        return answer;
    }
}
//
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            int[] command = commands[i];
            int[] temp = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(temp);
            answer[i] = temp[command[2] - 1];
        }
        return answer;
    }
}
