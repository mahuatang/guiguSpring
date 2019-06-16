package com.test.guigu.helloworld;

public class Car {
    private String companyName;
    private String brand;
    private int maxSpeed;
    private float price;

    public Car(String companyName, String brand, int maxSpeed) {
        super();
        this.companyName = companyName;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        System.out.println("max speed");
    }

    public Car(String companyName, String brand, float price) {
        super();
        this.companyName = companyName;
        this.brand = brand;
        this.price = price;
        System.out.println("price");
    }

    public Car(String companyName, String brand, int maxSpeed, float price) {
        super();
        this.companyName = companyName;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
        System.out.println("all");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        System.out.println("compantyName cc");
        this.companyName = companyName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("cc brand");
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        System.out.println("bb maxspeed");
        this.maxSpeed = maxSpeed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        System.out.println("price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "companyName='" + companyName + '\'' +
                ", brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
