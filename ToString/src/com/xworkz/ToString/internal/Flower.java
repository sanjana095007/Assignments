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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Flower) {
                System.out.println("Reference of Flower will be compared");
                Flower flower = this;
                Flower flower1 = (Flower) obj;
                if (flower.name.equals(flower1.name) && flower.color.equals(flower1.color) && flower.price == flower1.price) {
                    System.out.println("Both flowers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
