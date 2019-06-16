package com.test.guigu.ref;

import com.test.guigu.helloworld.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.text.DateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-auto.xml");
      /*  Action action = (Action)ctx.getBean("action");
        action.save();*/

        /*DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource.getConnection());*/

       /* User user = (User)ctx.getBean("boy");
        System.out.println(user.getUserName() + "  :  " + user.getWifeName());*/

      //  DateFormat dateformat = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat dateformat = (DateFormat) ctx.getBean("dateFormat");
        System.out.println(dateformat);
        System.out.println("-------------");
        User user = (User) ctx.getBean("user");
        System.out.println(user);

        ctx.close();
    }
}
