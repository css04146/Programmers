class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        for(String skill_tree : skill_trees){
            for(int i = 0; i < skill.length() - 1; i++){
                String s1 = String.valueOf(skill.charAt(i));
                String s2 = String.valueOf(skill.charAt(i + 1));
                if(skill_tree.contains(s1) && skill_tree.contains(s2)){
                    if(skill_tree.indexOf(s1) > skill_tree.indexOf(s2)){
                        answer--;
                        break;
                    }
                }
                if(!skill_tree.contains(s1) && skill_tree.contains(s2)){
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}
