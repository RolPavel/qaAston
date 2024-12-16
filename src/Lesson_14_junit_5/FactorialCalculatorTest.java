package Lesson_14_junit_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(1, FactorialCalculator.factorial(1));
        assertEquals(2, FactorialCalculator.factorial(2));
        assertEquals(6, FactorialCalculator.factorial(3));
        assertEquals(24, FactorialCalculator.factorial(4));
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    void testLargeFactorial() {
        assertEquals(3628800, FactorialCalculator.factorial(10)); // 10!
    }

    @Test
    void testNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-10));
    }
}

