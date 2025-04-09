package com.xworkz.ToString.internal;

public class Table {
    private String shape;
    private String material;
    private int numberOfLegs;

    public Table(String shape, String material, int numberOfLegs) {
        this.shape = shape;
        this.material = material;
        this.numberOfLegs = numberOfLegs;
    }

    public String toString() {
        return "Table - Shape: " + shape + ", Material: " + material + ", Legs: " + numberOfLegs;
    }
}
