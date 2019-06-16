package com2.test.guigu.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloworld");
        helloWorld.hello();
        HelloWorld helloWorld2 = (HelloWorld)ctx.getBean("helloworld");
        System.out.println(helloWorld == helloWorld2);
        ctx.close();
    }
}
