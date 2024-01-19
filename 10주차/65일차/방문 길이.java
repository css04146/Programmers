// 복습 요망
import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0, y = 0;
        Set<String> set = new HashSet<>();
        for(String dir : dirs.split("")){
            int cx = x;
            int cy = y;
            String temp = "";
            if(dir.equals("R")){
                cx = x + 1;
                temp += x;
                temp += y;
                temp += cx;
                temp += cy;
            } else if(dir.equals("L")){
                cx = x - 1;
                temp += cx;
                temp += cy;
                temp += x;
                temp += y;
            } else if(dir.equals("U")){
                cy = y + 1;
                temp += x;
                temp += y;
                temp += cx;
                temp += cy;
            } else{
                cy = y - 1;
                temp += cx;
                temp += cy;
                temp += x;
                temp += y;
            }
            if(cx > 5 || cx < -5
            || cy > 5 || cy < -5) continue;
            set.add(temp);
            x = cx; y = cy;
        }
        return set.size();
    }
}
