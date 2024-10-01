package com.skypro_test.skypro_test.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double sub(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double mult(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double div(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Second parameter cant be 0");
        }

        return num1 / num2;
    }
}
