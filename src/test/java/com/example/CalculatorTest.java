package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new calculator();
    }

    @Test
    @DisplayName("Addition: 2 + 2 should equal 4")
    void testAddition() {
        assertEquals(4, calculator.add(2, 2), "2 + 2 should equal 4");
    }

    @Test
    @DisplayName("Subtraction: handles negative results properly")
    void testSubtractionWithNegativeResult() {
        assertEquals(-5, calculator.subtract(5, 10), "5 - 10 should equal -5");
    }

    @Test
    @DisplayName("Multiplication: multiplying by zero returns zero")
    void testMultiplicationByZero() {
        assertEquals(0, calculator.multiply(42, 0), "Any number multiplied by 0 should be 0");
    }

    @Test
    @DisplayName("Division: returns accurate decimal result")
    void testDivision() {
        assertEquals(2.5, calculator.divide(5, 2), 0.0001, "5 / 2 should equal 2.5");
    }

    @Test
    @DisplayName("Division by zero: throws IllegalArgumentException")
    void testDivisionByZeroThrowsException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0),
                "Dividing by zero should throw IllegalArgumentException");
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
