import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        List<String> list1 = new ArrayList<>(); // str1의 집합
        List<String> list2 = new ArrayList<>(); // str2의 집합
        List<String> intersection = new ArrayList<>(); // 교집합
        for(int i = 0; i < str1.length() - 1; i++){
            String temp = str1.substring(i, i + 2);
            if(!Character.isLowerCase(temp.charAt(0))
            || !Character.isLowerCase(temp.charAt(1))) continue;
            list1.add(temp);
        }
        for(int i = 0; i < str2.length() - 1; i++){
            String temp = str2.substring(i, i + 2);
            if(!Character.isLowerCase(temp.charAt(0))
            || !Character.isLowerCase(temp.charAt(1))) continue;
            if(list1.remove(temp)) intersection.add(temp);
            list2.add(temp);
        }
        double union = list2.size() + list1.size();
        if(union == 0) return 65536;
        double jacard = intersection.size() / union;
        return (int)(jacard * 65536);
    }
}
