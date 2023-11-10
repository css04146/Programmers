import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0) return cities.length * 5;
        List<String> list = new ArrayList<>();
        for(String city : cities){
            city = city.toUpperCase();
            if(!list.isEmpty()){
                if(list.contains(city)){
                    list.remove(city);
                    answer += 1;
                    list.add(city);
                }
                else{
                    answer += 5;
                    list.add(city);
                }
                if(list.size() > cacheSize) list.remove(list.get(0));
            }
            else{
                list.add(city);
                answer += 5;
            }
        }
        return answer;
    }
}
