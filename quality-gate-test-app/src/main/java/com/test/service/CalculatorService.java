package com.test.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(double a, double b) {
        return a + b;
    }

    // changed the logic of subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double cubeRoot(double a) {
        return Math.cbrt(a);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double dividebytwo(double a) {
        return a / 2;
    }
}
