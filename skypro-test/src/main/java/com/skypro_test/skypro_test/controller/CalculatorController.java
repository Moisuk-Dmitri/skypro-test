package com.skypro_test.skypro_test.controller;

import com.skypro_test.skypro_test.service.CalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return num1 + " - " + num2 + " = " + calculatorService.sub(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return num1 + " * " + num2 + " = " + calculatorService.mult(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return num1 + " / " + num2 + " = " + calculatorService.div(num1, num2);
    }
}
