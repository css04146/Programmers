// 복습 요
import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0, y = 0;
        Set<String> set = new HashSet<>();
        for(String dir : dirs.split("")){
            String temp = "";
            int cx = x, cy = y;
            if(dir.equals("U")){
                temp += x;
                temp += y;
                temp += cx;
                temp += ++cy;
            }
            else if(dir.equals("D")){
                temp += cx;
                temp += --cy;
                temp += x;
                temp += y;
            }
            else if(dir.equals("R")){
                temp += x;
                temp += y;
                temp += ++cx;
                temp += cy;
            }
            else{
                temp += --cx;
                temp += cy;
                temp += x;
                temp += y;
            }
            if(cx < -5 || cx > 5
            || cy < -5 || cy > 5) continue;
            set.add(temp);
            x = cx;
            y = cy;
        }
        return set.size();
    }
}
