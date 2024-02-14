import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(String dirs) {
        int x = 0, y = 0;
        Set<String> set = new HashSet<>();
        for(String dir : dirs.split("")){
            String temp = "";
            int cx = x, cy = y;
            if(dir.equals("R")){
                cx += 1;
                temp += cx;
                temp += cy;
                temp += x;
                temp += y;
            } else if(dir.equals("L")){
                cx -= 1;
                temp += x;
                temp += y;
                temp += cx;
                temp += cy;
            } else if(dir.equals("U")){
                cy += 1;
                temp += cx;
                temp += cy;
                temp += x;
                temp += y;
            } else{
                cy -= 1;
                temp += x;
                temp += y;
                temp += cx;
                temp += cy;
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
