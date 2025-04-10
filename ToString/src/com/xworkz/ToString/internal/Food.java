package com.xworkz.ToString.internal;

public class Food {
    private String name;
    private String category;
    private double price;

    public Food(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name :"+name+" "+ "category :"+category+" "+"price :"+price;
    }
    @Override
    public int hashCode() {
        return 138;
    }
}

