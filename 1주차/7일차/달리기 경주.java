import java.util.Map;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) hm.put(players[i], i);
        
        for(String calling : callings){
            if(!hm.containsKey(calling)) continue; // 없어도 되지만 버릇들이려고 써둠
            int rank = hm.get(calling);
            
            players[rank] = players[rank - 1];
            players[rank - 1] = calling;
            
            hm.put(players[rank - 1], rank - 1);
            hm.put(players[rank], rank);
        }
        
        return players;
    }
}
