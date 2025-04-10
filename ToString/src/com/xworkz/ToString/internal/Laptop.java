package com.xworkz.ToString.internal;

public class Laptop {
    private String brand;
    private int  price;
    private int ramGB;

    public Laptop(String brand, int price, int ramGB) {
        this.brand = brand;
        this.price = price;
        this.ramGB = ramGB;
    }

    @Override
    public String toString() {
        return "brand :"+brand+" "+ "price :"+price+" "+"ramGB :"+ramGB;
    }
}

