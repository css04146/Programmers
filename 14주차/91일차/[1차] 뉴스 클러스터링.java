import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> intersection = new ArrayList<>();
        for(int i = 0; i < str1.length() - 1; i++){
            String temp = str1.substring(i, i + 2);
            char c1 = temp.charAt(0);
            char c2 = temp.charAt(1);
            if(c1 < 'a' || c1 > 'z') continue;
            else if(c2 < 'a' || c2 > 'z') continue;
            else list1.add(temp);
        }
        for(int i = 0; i < str2.length() - 1; i++){
            String temp = str2.substring(i, i + 2);
            char c1 = temp.charAt(0);
            char c2 = temp.charAt(1);
            if(c1 < 'a' || c1 > 'z') continue;
            else if(c2 < 'a' || c2 > 'z') continue;
            else{
                if(list1.remove(temp)) intersection.add(temp);
                else list2.add(temp);
            }
        }
        int total = list1.size() + list2.size() + intersection.size();
        if(total == 0) return 65536;
        double answer = (double)intersection.size() / total;
        answer *= 65536;
        return (int)answer;
    }
}
