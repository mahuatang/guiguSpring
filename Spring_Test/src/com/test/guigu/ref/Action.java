package com.test.guigu.ref;

public class Action {
    public Service service;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void save() {
        System.out.println("action save");
        service.save();
    }
}
