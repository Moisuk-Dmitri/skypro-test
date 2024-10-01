package com.skypro_test.skypro_test;

import com.skypro_test.skypro_test.service.CalculatorService;
import com.skypro_test.skypro_test.service.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParametrizedTest {

    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(22.1, 32.6),
                Arguments.of(43.65, 32.1),
                Arguments.of(5.8, 45.2),
                Arguments.of(25.51, 71.99),
                Arguments.of(8.25, 55.63));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldSumCorrectly(double num1, double num2) {
        double result = num1 + num2;
        assertEquals(result, calculatorService.sum(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldSubCorrectly(double num1, double num2) {
        double result = num1 - num2;
        assertEquals(result, calculatorService.sub(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldMultCorrectly(double num1, double num2) {
        double result = num1 * num2;
        assertEquals(result, calculatorService.mult(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldDivCorrectly(double num1, double num2) {
        double result = num1 / num2;
        assertEquals(result, calculatorService.div(num1, num2));
    }
}
