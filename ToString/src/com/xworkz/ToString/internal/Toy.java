package com.xworkz.ToString.internal;

public class Toy {
    private String name;
    private String category;
    private double price;

    public Toy(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String toString() {
        return "Toy name: " + name + ", Category: " + category + ", Price: " + price;
    }
    @Override
    public int hashCode() {
        return 189;
    }
}
