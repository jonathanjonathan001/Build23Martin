package org.example.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void addZeroWitchZeroShouldReturnZero() {
        int result = Calculator.test(0,0);

        assertEquals(0, result);
    }

    @Test
    void addOneWithOneShouldReturnTwo(){
        int result = Calculator.test(1,1);

        assertEquals(2, result);
    }

    @Test
    void addOneWithTwoShouldReturnThree(){
        int result = Calculator.test(1, 2);

        assertEquals(3, result);
    }
    
    @Nested
    @DisplayName("Count common numbers")
    class Count {
        @Test
        void twoEmptyArraysHasZeroCommonNumbers() {
            var array1 = new int[0];
            var array2 = new int[0];

            assertEquals(0, Calculator.commonCount(array1, array2));

        }

        @Test
        void twoArraysWithSameNumberHasOneCommonNumber() {
            var array1 = new int[]{2};
            var array2 = new int[]{2};

            assertEquals(1, Calculator.commonCount(array1, array2));

        }

        @Test
        void twoArraysWithSameNumberHasTwoCommonNumbers() {
            var array1 = new int[]{2, 3};
            var array2 = new int[]{2, 3};

            assertEquals(2, Calculator.commonCount(array1, array2));
        }

        @Test
        void twoArraysWithDifferentLengthTwoCommonNumbers() {
            var array1 = new int[]{1, 2, 3};
            var array2 = new int[]{2, 3};

            assertEquals(2, Calculator.commonCount(array1, array2));
        }

        @Test
        void twoArraysWithUnorderedNumbersHasTwoCommonNumbers() {
            var array1 = new int[]{3, 1, 2,};
            var array2 = new int[]{2, 3};

            assertEquals(2, Calculator.commonCount(array1, array2));
        }

        @Test
        void usingNullAsArgumentShouldReturnZeroCommonNumbers() {
            assertEquals(0, Calculator.commonCount(null, null));
        }
    }

    @Nested
    @DisplayName("Greeting")
    class Greeting {
        @Test
        @DisplayName("when time < 12 greet with Good morning")
        void whenTimeOfDayIsBefore12GreetWithGoodMorning(){
            assertEquals("Good morning Martin", Calculator.greeting("Martin", LocalTime.of(7,20)));
        }

        @Test
        @DisplayName("when time > 12 greet with Good afternoon")
        void whenTimeOfDayIsAfter12GreetWithGoodAfternoon(){
            assertEquals("Good afternoon Kalle", Calculator.greeting("Kalle", LocalTime.of(12,0)));
        }

    }

}


