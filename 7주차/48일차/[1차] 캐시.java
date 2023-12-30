import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize == 0) return cities.length * 5;
        List<String> list = new ArrayList<>();
        for(String city : cities){
            city = city.toUpperCase();
            if(list.isEmpty()){
                list.add(city);
                answer += 5;
            }
            else{
                if(list.contains(city)){
                    list.remove(city);
                    list.add(city);
                    answer += 1;
                }
                else{
                    if(list.size() == cacheSize){
                        list.remove(0);
                        list.add(city);
                    }
                    else list.add(city);
                    answer += 5;
                }
            }
        }
        return answer;
    }
}
