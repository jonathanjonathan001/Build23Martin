package org.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void addZeroWitchZeroShouldReturnZero() {
        int result = Calculator.test(0,0);

        assertEquals(0, result);
    }
}
