import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int[] command = commands[i];
            int[] temp = new int[command[1] - command[0] + 1];
            for(int j = 0; j < temp.length; j++){
                temp[j] = array[j + command[0] - 1];
            }
            Arrays.sort(temp);
            answer[i] = temp[command[2] - 1];
        }
        return answer;
    }
}
// 다음번엔 Arrays.copyOfRange() 사용해보기
