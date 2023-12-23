class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        for(String skill_tree : skill_trees){
            if(skill.indexOf(skill_tree.replaceAll("[^" + skill + "]", "")) != 0){
                answer--;
            }
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
        List<String> list = new ArrayList<String>(Arrays.asList(skill_trees));
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            if(skill.indexOf(iter.next().replaceAll("[^" + skill + "]", "")) != 0){
                iter.remove();
            }
        }
        return list.size();
    }
}
