class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        int p_count = 0, y_count = 0;
        for(String i : s.split("")){
            if(i.equals("P")) p_count++;
            if(i.equals("Y")) y_count++;
        }
        return p_count == y_count ? true : false;
    }
}
