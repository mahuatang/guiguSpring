package com.test.guigu.ref;

import com.test.guigu.helloworld.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if(s.equals("boy"))
            System.out.println("postProcessBeforeInitialization..." + o + "," + s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if(s.equals("boy")){
            System.out.println("postProcessAfterInitialization..." + o + "," + s);
            User user = (User) o;
            user.setUserName("李大齐");
        }
        return o;
    }
}

