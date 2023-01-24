package org.example.calculator;

import org.junit.jupiter.api.Test;
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


}


