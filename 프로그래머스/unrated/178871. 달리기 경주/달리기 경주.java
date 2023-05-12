import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> rank = new HashMap<>();
        for (int i = 0; i<players.length; i++){
            rank.put(players[i],i);
        }
        for (String player : callings){
            
            int rankNum = rank.get(player); // 추월한 선수 등수
            String beforePlayer = players[rankNum-1];   // 추월 당한 선수 등수
            
            // players 배열 갱신
            players[rankNum-1] = player;
            players[rankNum] = beforePlayer;
            
            // rank 갱신
            rank.put(player,rankNum-1);
            rank.put(beforePlayer,rankNum);

        }
        return players;
    }
}