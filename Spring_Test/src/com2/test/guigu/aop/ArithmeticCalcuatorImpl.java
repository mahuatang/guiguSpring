package com2.test.guigu.aop;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalcuatorImpl implements ArithmeticCalcuator {
    @Override
    public int add(int a, int b) {
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
