package com.xworkz.ToString.internal;

public class Television {
    private String brand;
    private int sizeInInches;
    private boolean isSmartTV;

    public Television(String brand, int sizeInInches, boolean isSmartTV) {
        this.brand = brand;
        this.sizeInInches = sizeInInches;
        this.isSmartTV = isSmartTV;
    }

    public String toString() {
        return "Television - Brand: " + brand + ", Size: " + sizeInInches + " inch, Smart TV: " + isSmartTV;
    }
}
