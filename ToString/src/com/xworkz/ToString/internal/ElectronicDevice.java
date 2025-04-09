package com.xworkz.ToString.internal;

public class ElectronicDevice {
    private String type;
    private String brand;
    private double cost;

    public ElectronicDevice(String type, String brand, double cost) {
        this.type = type;
        this.brand = brand;
        this.cost = cost;
    }

    public String toString() {
        return "type: " + type + ", Brand: " + brand + ", Cost: $" + cost;
    }
}
