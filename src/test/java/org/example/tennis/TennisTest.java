package org.example.tennis;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class TennisTest {

    @Test
    void newTennisObjectHasScoreLoveLove(){
        Tennis tennis = new Tennis();

        assertThat(tennis.readScore()).isEqualTo("love-love");
    }

}
