class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        java.util.Map<String, Integer> hm = new java.util.HashMap<>();
        for(int i = 0; i < name.length; i++) hm.put(name[i], yearning[i]);
        int[] answer = new int[photo.length];
        for(int i = 0; i < answer.length; i++){
            for(String s : photo[i]) answer[i] += hm.getOrDefault(s, 0);
        }
        return answer;
    }
}
