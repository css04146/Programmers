import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        double max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < progresses.length; i++){
            double progress = 100 - progresses[i];
            list.add((int)Math.ceil(progress / speeds[i]));
        }
        for(double d : list){
            if(d > max){
                answer.add(1);
                max = d;
            }
            else{
                int count = answer.remove(answer.size() - 1);
                answer.add(count + 1);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
