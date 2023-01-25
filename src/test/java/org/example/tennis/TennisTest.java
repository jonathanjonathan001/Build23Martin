package org.example.tennis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TennisTest {

    private Tennis tennis = new Tennis();


    private void play40_40() {
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player2");
        tennis.incrementScore("player2");
    }


    @Test
    void newTennisObjectHasScoreLoveLove(){

        assertThat(tennis.readScore()).isEqualTo("love-love");
    }

    @Test
    void afterPlayer1WinsBallScoreShouldBe15Love(){


        tennis.incrementScore("player1");

        assertThat(tennis.readScore()).isEqualTo("15-love");
    }

    @Test
    void afterPlayersHaveWonOneBallEachScoreShouldBe1515() {

        tennis.incrementScore("player1");
        tennis.incrementScore("player2");

        assertThat(tennis.readScore()).isEqualTo("15-15");
    }

    @Test
    void afterPlayer1HasWonTwoBallsScoreShouldBe30Love(){


        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        assertThat(tennis.readScore()).isEqualTo("30-love");
    }

    void afterPlayer1HasWonThreeBallsScoreShouldBe40Love() {


        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        assertThat(tennis.readScore()).isEqualTo("40-love");
    }

    @Test
    void playerThatHasWon3BallsAndWinsAnotherShouldWinTheGame(){

        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");

        assertThat(tennis.isGameOver()).isTrue();
    }

    @Test
    void whenBothPlayersHaveWon3BallsPlayer1ShouldNotWinAfterOneMoreBall(){

        play40_40();
        tennis.incrementScore("player1");

        assertThat(tennis.isGameOver()).isFalse();

    }



    @Test

    void whenOnePlayerHasWon2MoreBallsThanTheOtherGameIsOver() {


        play40_40();
        tennis.incrementScore("player1");
        tennis.incrementScore("player1");


        assertThat(tennis.isGameOver()).isTrue();

    }

    @Test
    void whenBothPlayersHaveScoredAtLeast3BallsAndTheyHaveTheSameScoreScoreShouldBeDeuce(){

        play40_40();

        assertThat(tennis.readScore()).isEqualTo("deuce");
        assertThat(tennis.isGameOver()).isFalse();
    }

    @Test
    void whenBothPlayersHaveSameScoreAndMoreThan3BallsShouldBeDeuce(){

        play40_40();
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");

        assertThat(tennis.readScore()).isEqualTo("deuce");
        assertThat(tennis.isGameOver()).isFalse();
    }

    @Test
    void whenBothPlayersHaveMoreThan3BallsAndPlayerOneHasAdvantageOfOneShouldBeAdvantagePlayerName(){

        play40_40();
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player1");


        assertThat(tennis.readScore()).isEqualTo("advantage player1");
        assertThat(tennis.isGameOver()).isFalse();
    }

    @Test
    void whenBothPlayersHaveMoreThan3BallsAndPlayer2HasAdvantageOfOneShouldBeAdvantagePlayerName(){

        play40_40();
        tennis.incrementScore("player1");
        tennis.incrementScore("player2");
        tennis.incrementScore("player2");


        assertThat(tennis.readScore()).isEqualTo("advantage player2");
        assertThat(tennis.isGameOver()).isFalse();
    }





}
