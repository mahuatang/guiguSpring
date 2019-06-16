package com2.test.guigu.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-annotation.xml");

       /* UserAction action = new UserAction();
        action.actionSave();*/
        UserAction userAction = (UserAction)ctx.getBean("userAction");
        userAction.actionSave();
        UserService22 userService = (UserService22)ctx.getBean("userService22");
        userService.serviceSave();
    }
}
