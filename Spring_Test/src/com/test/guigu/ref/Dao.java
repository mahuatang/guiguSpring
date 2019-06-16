package com.test.guigu.ref;

public class Dao {
    private String dataSource = "dbcp";

    public Dao() {
        System.out.println("Dao constructor...");
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public void save() {
        System.out.println("save by: " + dataSource);
    }
}
