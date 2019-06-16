package com3.test.guigu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       /* ArithmeticCalcuator arithmeticCalculator = new ArithmeticCalcuatorImpl();
		arithmeticCalculator = new ArithmeticLoggingCalcuatorProxy(arithmeticCalculator).getLoggingProxy();

		int result = arithmeticCalculator.add(11, 12);
		System.out.println("result:" + result);

		result = arithmeticCalculator.divide(21, 3);
		System.out.println("result:" + result);*/

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
		ArithmeticCalcuator arithmeticCalcuator = (ArithmeticCalcuator)ctx.getBean("arithmeticCalcuatorImpl");
		System.out.println(arithmeticCalcuator.getClass().getName());
	//	System.out.println(arithmeticCalcuator.add(2, 3));
		System.out.println(arithmeticCalcuator.divide(2, 0));
	}
}
