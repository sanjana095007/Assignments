package com.xworkz.ToString.internal;

public class Flower {
   private String name;
   private String color;
   private double price;

    public Flower(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Flower: " + name + ", Color: " + color + ", Price: " + price;
    }
    @Override
    public int hashCode() {
        return 137;
    }
}
