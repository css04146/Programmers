// 복습 요
import java.util.Arrays;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int day = 0;
        int[] function = new int[100];
        for(int i = 0; i < progresses.length; i++){
            while(progresses[i] + speeds[i] * day < 100) day++;
            function[day]++;
        }
        return Arrays.stream(function).filter(i -> i != 0).toArray();
    }
}
//
import java.util.List;
import java.util.ArrayList;
class Solution {
    class Task{
        int progress;
        int speed;
        Task(int progress, int speed){
            this.progress = progress;
            this.speed = speed;
        }
        void makeProgress(){
            this.progress += this.speed;
        }
        boolean isComplete(){
            return this.progress >= 100;
        }
    }
    public int[] solution(int[] progresses, int[] speeds) {
        List<Task> taskList = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        
        for(int i = 0; i < speeds.length; i++){
            taskList.add(new Task(progresses[i], speeds[i]));
        }
        
        while(!taskList.isEmpty()){
            for(Task task : taskList){
                task.makeProgress();
            }
            
            int cnt = 0;
            for(int i = 0; i < taskList.size(); i++){
                if(taskList.get(i).isComplete()){
                    cnt++;
                    taskList.remove(i--);
                }
                else break;
            }
            if(cnt != 0) output.add(cnt);
        }
        
        return output.stream().mapToInt(i -> i).toArray();
    }
}
