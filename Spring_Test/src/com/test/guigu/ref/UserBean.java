package com.test.guigu.ref;

import com.test.guigu.helloworld.Car;
import com.test.guigu.helloworld.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

import java.util.ArrayList;
import java.util.List;

public class UserBean implements FactoryBean<User> {
    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUserName("abc");
        user.setWifeName("ABC");

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("ShangHai", "BuiKe", 180, 300000));
        cars.add(new Car("ShangHai", "CRUZE", 130, 150000));

        user.setCars(cars);
        return user;
    }
}
