package com.xworkz.ToString.internal;

public class Furniture {
    private String type;
    private  String material;
    private double cost;

    public Furniture(String type, String material, double cost) {
        this.type = type;
        this.material = material;
        this.cost = cost;
    }

    public String toString() {
        return "Furniture type: " + type + ", Material: " + material + ", Cost:" + cost;
    }
}