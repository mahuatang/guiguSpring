package com.test.guigu.helloworld;

import java.util.List;

public class User {
    private String userName;
    private String wifeName;
    private List<Car> cars;

    public User() {
        System.out.println("constructor user");
    }

    public String getUserName() {
        System.out.println("User getuserName");
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("setUsername invoked");
        this.userName = userName;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        System.out.println("setwifeName invoked");
        this.wifeName = wifeName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", wifeName='" + wifeName + '\'' +
                ", cars=" + cars +
                '}';
    }

    public void init22() {
        System.out.println("user inint 22  sttt");
    }

    public void destory22() {
        System.out.println("user destory 22 yyy");
    }
}
