package com.test.guigu.ref;

public class Service {
    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public Dao getDao() {
        return dao;
    }

    public void save() {
        System.out.println("service save");
        dao.save();
    }
}
