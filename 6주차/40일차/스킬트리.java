class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String skill_tree : skill_trees){
            skill_tree = skill_tree.replaceAll("[^" + skill + "]", "");
            if(skill.indexOf(skill_tree) == 0) answer++;
        }
        return answer;
    }
}
//
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        List<String> list = new ArrayList<>(Arrays.asList(skill_trees));
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            if(skill.indexOf(iter.next().replaceAll("[^" + skill + "]", "")) != 0){
                iter.remove();
            }
        }
        return list.size();
    }
}
