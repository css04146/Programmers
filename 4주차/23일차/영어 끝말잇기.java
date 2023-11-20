import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(!list.isEmpty()){
                String word = words[i];
                String temp = list.get(list.size() - 1);
                if(list.contains(word)){
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    return answer;
                }
                if(word.charAt(0) != temp.charAt(temp.length() - 1)){
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    return answer;
                }
                list.add(word);
            } 
            else list.add(words[i]);
        }
        return answer;
    }
}
