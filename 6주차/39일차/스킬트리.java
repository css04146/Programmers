// 복습 요
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        for(String skill_tree : skill_trees){
            for(int i = 0; i < skill.length() - 1; i++){
                String s1 = String.valueOf(skill.charAt(i));
                String s2 = String.valueOf(skill.charAt(i + 1));
                if(skill_tree.contains(s1) && skill_tree.contains(s2)){
                    if(skill_tree.indexOf(s1) > skill_tree.indexOf(s2)){
                        answer--; break;
                    }
                }
                if(!skill_tree.contains(s1) && skill_tree.contains(s2)){
                    answer--; break;
                }
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
