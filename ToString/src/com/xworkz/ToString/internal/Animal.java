package com.xworkz.ToString.internal;

public class Animal {
    private String name;
    private int height;
    private double weight;

    public Animal(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal: name = " + name + ", height : " + height + ", Weight = " + weight + " kg";
    }
    @Override
    public int hashCode() {
        return 102;
    }
}

