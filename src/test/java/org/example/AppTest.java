package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


class AppTest {
    @Test
    void test() {

        assertTrue(true);
        assertThat(true).isTrue();
    }

    @Test
    void addTwoNumbersReturnsSum() {
        var result = App.add(1,1);

        assertEquals(2,result);
    }
}