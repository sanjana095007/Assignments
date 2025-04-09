package com.xworkz.ToString.internal;

public class Mobile {
    private String brand;
    private String model;
    private double price;

    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand :"+brand+" "+ "model :"+model+" "+"price :"+price;
    }
}

