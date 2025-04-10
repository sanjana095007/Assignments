package com.xworkz.ToString.internal;

public class FashionDesigner {
    private String name;
    private String brand;
    private int collections;

    public FashionDesigner(String name, String brand, int collections) {
        this.name = name;
        this.brand = brand;
        this.collections = collections;
    }

    public String toString() {
        return "FashionDesigner: " + name + ", Brand: " + brand + ", Collections: " + collections;
    }
    @Override
    public int hashCode() {
        return 132;
    }
}
