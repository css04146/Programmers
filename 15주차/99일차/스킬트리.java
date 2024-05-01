class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        for(String skill_tree : skill_trees){
            for(int i = 0; i < skill.length() - 1; i++){
                String c1 = String.valueOf(skill.charAt(i));
                String c2 = String.valueOf(skill.charAt(i + 1));
                if(!skill_tree.contains(c1)
                && skill_tree.contains(c2)){
                    answer--;
                    break;
                }
                if(skill_tree.contains(c1)
                && skill_tree.contains(c2)){
                    if(skill_tree.indexOf(c1) > skill_tree.indexOf(c2)){
                        answer--;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
// ***************************************************************
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
