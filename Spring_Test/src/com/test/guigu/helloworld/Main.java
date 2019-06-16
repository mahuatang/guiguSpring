package com.test.guigu.helloworld;

import com.test.guigu.ref.Action;
import com.test.guigu.ref.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

       /* HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloworld");

        helloWorld.hello();*/

       /*HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

       helloWorld.hello(); */

       /*HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloworld2");
       helloWorld.hello();*/

       System.out.println("=============");
       Car car = (Car)ctx.getBean("car");
       car = (Car)ctx.getBean("car2");

       System.out.println("****************");
       Service service = (Service)ctx.getBean("service2");
       service.save();

       System.out.println("&&&&&&&&&&&&&&");
       Action action = (Action)ctx.getBean("action2");
       action.save();

       System.out.println("))))))))))))");
       User user = (User)ctx.getBean("user5");
       System.out.println(user.getCars());
       System.out.println(user.getUserName());




    }
}
