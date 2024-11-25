package com.skypro_test.skypro_test;

import com.skypro_test.skypro_test.service.CalculatorServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    double num1_1;
    double num1_2;
    double num2_1;
    double num2_2;

    @BeforeEach
    public void setup() {
        num1_1 = 2.3;
        num1_2 = 1.6;

        num2_1 = 4.67;
        num2_2 = 56.1;
    }

    @Test
    public void sumTest() {
        double expected1 = num1_1 + num1_2;
        double actual1 = calculatorService.sum(num1_1, num1_2);

        assertEquals(expected1, actual1);

        double expected2 = num2_1 + num2_2;
        double actual2 = calculatorService.sum(num2_1, num2_2);

        assertEquals(expected2, actual2);
    }

    @Test
    public void subTest() {
        double expected1 = num1_1 - num1_2;
        double actual1 = calculatorService.sub(num1_1, num1_2);

        assertEquals(expected1, actual1);

        double expected2 = num2_1 - num2_2;
        double actual2 = calculatorService.sub(num2_1, num2_2);

        assertEquals(expected2, actual2);
    }

    @Test
    public void multTest() {
        double expected1 = num1_1 * num1_2;
        double actual1 = calculatorService.mult(num1_1, num1_2);

        assertEquals(expected1, actual1);

        double expected2 = num2_1 * num2_2;
        double actual2 = calculatorService.mult(num2_1, num2_2);

        assertEquals(expected2, actual2);
    }

    @Test
    public void divTest() {
        double expected1 = num1_1 / num1_2;
        double actual1 = calculatorService.div(num1_1, num1_2);

        assertEquals(expected1, actual1);

        double expected2 = num2_1 / num2_2;
        double actual2 = calculatorService.div(num2_1, num2_2);

        assertEquals(expected2, actual2);

        assertThrows(IllegalArgumentException.class, () -> calculatorService.div(0, 0));
    }
}
