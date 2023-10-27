import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int index = 0;
        int answer = 0;
        Arrays.sort(people);
        for(int i = people.length - 1; i >= index; i--){
            index = people[i] + people[index] <= limit ? index + 1 : index;
            answer++;
        }
        return answer;
    }
}
