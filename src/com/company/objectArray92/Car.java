package com.company.objectArray92;

public class Car {
    private String brand;
    private int pirce;
    private String color;

    public Car() {
    }

    public Car(String brand, int pirce, String color) {
        this.brand = brand;
        this.pirce = pirce;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPirce() {
        return pirce;
    }

    public void setPirce(int pirce) {
        this.pirce = pirce;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
