package com.xworkz.ToString.internal;

public class Bike {
    private String brand;
    private String type;
    private double price;

    public Bike(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand :" + brand + " " + "type :" + type + " " + "price :" + price;
    }
}
