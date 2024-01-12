import java.util.Map;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> hidx = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            hidx.put(players[i], i);
        }
        for(String calling : callings){
            int rank = hidx.get(calling);
            players[rank] = players[rank - 1];
            players[rank - 1] = calling;
            hidx.put(players[rank], rank);
            hidx.put(players[rank - 1], rank - 1);
        }
        return players;
    }
}
