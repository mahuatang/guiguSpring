package com3.test.guigu;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalcuatorImpl implements ArithmeticCalcuator {
    @Override
    public int add(int a, int b) {
        System.out.println("**********8888888");
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }
}
