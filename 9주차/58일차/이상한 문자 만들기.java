// 복습 요망
class Solution {
    public String solution(String s) {
        int count = 0;
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(String i : s.split("")){
            count = i.equals(" ") ? 0 : count + 1;
            sb.append(count % 2 == 1 ? i.toUpperCase() : i);
        }
        return sb.toString();
    }
}
