package org.example.tennis;

import java.util.HashMap;
import java.util.Map;

public class Tennis {
    private Map<String, Integer> scores = new HashMap<>();
    private int score;

    public Tennis() {
        scores.put("player1", 0);
        scores.put("player2", 0);
    }
    public String readScore() {
        int player1Score = scores.get("player1");
        int player2Score = scores.get("player2");

        String scoreAsString = "";

        scoreAsString += convertScore(player1Score);

        scoreAsString += "-";

        scoreAsString += convertScore(player2Score);


        return scoreAsString;
    }

    private static String convertScore(int playerScore) {
        if (playerScore == 3)
            return "40";
        else if (playerScore == 2)
            return "30";
        else if (playerScore == 1)
            return "15";
        else
            return "love";

    }

    public void incrementScore(String player) {
        score++;
        scores.put(player, scores.get(player) + 1);
    }

    public boolean isGameOver() {
        if ((scores.get("player1") > 3 || scores.get("player2") > 3)
                && Math.abs(scores.get("player1") - scores.get("player2")) > 1)
            return true;
        return false;
    }
}