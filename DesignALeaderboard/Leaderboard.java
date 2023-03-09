package DesignALeaderboard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Leaderboard {
    HashMap<Integer, Integer> scores;

    public Leaderboard(){
        scores = new HashMap<>();
    }

    public void addScore(int playerId, int score){
        scores.put(playerId, score + scores.getOrDefault(playerId, 0));
    }

    public int top(int k){
        List<Integer> topScores = new ArrayList<>(scores.values());
        Collections.sort(topScores);
        Collections.reverse(topScores);
        System.out.println(topScores);

        int total = 0;
        for(int i = 0; i < k; i++){
            total += topScores.get(i);
        }
        return total;
    }

    public void reset(int playerId){
        scores.remove(playerId);
    }
    public static void main(String[] args) {
        String name[] = {"Leaderboard","addScore","addScore","addScore","addScore","addScore","top","reset","reset","addScore","top"};
        System.out.println();
    }
}