import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        if(cacheSize == 0) return cities.length * 5;
        for(String city : cities){
            city = city.toLowerCase();
            if(!list.isEmpty()){
                if(list.contains(city)){
                    answer += 1;
                    list.remove(city);
                    list.add(city);
                }
                else{
                    answer += 5;
                    if(list.size() == cacheSize) list.remove(list.get(0));
                    list.add(city);
                }
            }
            else{
                list.add(city);
                answer += 5;
            }
        }
        return answer;
    }
}
