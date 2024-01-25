import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < players.length; i++) hm.put(players[i], i);
        for(String calling : callings){
            int rank = hm.get(calling);
            players[rank] = players[rank - 1];
            players[rank - 1] = calling;
            hm.put(players[rank - 1], rank - 1);
            hm.put(players[rank], rank);
        }
        return players;
    }
}
