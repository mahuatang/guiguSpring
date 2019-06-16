package com.test.guigu.helloworld;

public class HelloWorld {
    private String user;

    public HelloWorld(String user) {
        System.out.println("hello bb");
        this.user = user;
    }

    public HelloWorld() {
        System.out.println("Helloworld constructor");
    }

    public void setUser(String user) {
        System.out.println("setUser invoked: " + user);
        this.user = user;
    }

    public void hello() {
        System.out.println("hello : " + user);
    }
}
