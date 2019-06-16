package com2.test.guigu.aop;

public class ArithmeticLoggingCalcuatorImpl implements ArithmeticCalcuator {
    @Override
    public int add(int a, int b) {
        System.out.println("The method add begins with [" + a + "," + b + "]");
        int result = a + b;
        System.out.println("The method add ends with " + result);
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        System.out.println("The method subtract begins with [" + a + "," + b + "]");
        int result = a - b;
        System.out.println("The method subtract ends with " + result);
        return result;
    }

    @Override
    public int multiply(int a, int b) {
        System.out.println("The method multiply begins with [" + a + "," + b + "]");
        int result = a * b;
        System.out.println("The method multiply ends with " + result);
        return result;
    }

    @Override
    public int divide(int a, int b) {
        System.out.println("The method divide begins with [" + a + "," + b + "]");
        int result = a / b;
        System.out.println("The method divide ends with " + result);
        return result;
    }
}
