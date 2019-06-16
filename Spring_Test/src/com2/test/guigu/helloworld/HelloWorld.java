package com2.test.guigu.helloworld;

public class HelloWorld {
    private String user;

    public HelloWorld() {
        System.out.println("HelloWorld's constructor...");
    }

    public void setUser(String user) {
        System.out.println("setUser::  " + user);
        this.user = user;
    }

    public void hello() {
        System.out.println("Hello: " + user);
    }

    public void init() {
        System.out.println("init   method   :::::::");
    }

    public void destory() {
        System.out.println("destory     method      ::::::::");
    }
}
