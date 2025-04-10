package com.xworkz.ToString.internal;

public class Bag {
   private String brand;
   private int capacityInLiters;
   private boolean isWaterproof;

    public Bag(String brand, int capacityInLiters, boolean isWaterproof) {
        this.brand = brand;
        this.capacityInLiters = capacityInLiters;
        this.isWaterproof = isWaterproof;
    }

    public String toString() {
        return "Bag - Brand: " + brand + ", Capacity: " + capacityInLiters + "L, Waterproof: " + isWaterproof;
    }
    @Override
    public int hashCode() {
        return 104;
    }
}
