import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int len = cities.length;
        if(cacheSize == 0) return len * 5;
        List<String> list = new ArrayList<>();
        for(String city : cities){
            city = city.toUpperCase();
            if(list.isEmpty()){
                list.add(city);
                answer += 5;
            }
            else if(list.contains(city)){
                list.remove(city);
                list.add(city);
                answer += 1;
            }
            else{ // list에 city가 포함되어 있지 않다면
                if(list.size() == cacheSize){
                    list.add(city);
                    list.remove(0);
                    answer += 5;
                }
                else{
                    list.add(city);
                    answer += 5;
                }
            }
        }
        return answer;
    }
}
