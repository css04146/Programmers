import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int index = 0;
        int answer = 0;
        Arrays.sort(people);
        for(int i = people.length - 1; i >= index; i--){
            if(people[i] + people[index] <= limit) index++;
            answer++;
        }
        return answer;
    }
}
