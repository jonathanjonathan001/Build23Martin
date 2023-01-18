package org.example.triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    void whenGivenScaleneTriangleIsScaleneReturnsTrue() {
        Triangle triangle = new Triangle(1,2,3);

        assertTrue(triangle.isScalene());
    }

    @Test
    void whenGivenEquilateralTriangleIsScaleneReturnsFalse() {
        Triangle triangle = new Triangle(3,3,3);

        assertFalse(triangle.isScalene());
    }

    @Test
    void whenGivenIsoscelesTriangleIsScaleneReturnsFalse() {
        Triangle triangle = new Triangle(3, 2, 2);

        assertFalse(triangle.isScalene());
    }

    @Test
    void whenGivenScaleneTriangleIsEquilateralReturnsFalse() {
        Triangle triangle = new Triangle(1,2,3);

        assertFalse(triangle.isEquilateral());
    }

    @Test
    void whenGivenEquilateralTriangleIsEquilateralReturnsTrue() {
        Triangle triangle = new Triangle(3,3,3);

        assertTrue(triangle.isEquilateral());
    }

    @Test
    void whenGivenAnIsoscelesTriangleIsIsocelesReturnsTrue() {
        Triangle triangle = new Triangle(1,2,2);

        assertTrue(triangle.isIsosceles());
    }

    @Test
    void handlingDoubleValuesEqual() {
        double d = 0.1;

        var result = 0.1 + 0.2;

        assertEquals(0.3, result, 0.00001);
    }


}
