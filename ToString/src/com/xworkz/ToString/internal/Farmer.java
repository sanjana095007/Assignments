package com.xworkz.ToString.internal;

public class Farmer {
    private String name;
    private String crop;
    private int landSize;

    public Farmer(String name, String crop, int landSize) {
        this.name = name;
        this.crop = crop;
        this.landSize = landSize;
    }

    public String toString() {
        return "Farmer name: " + name + ", Crop: " + crop + ", Land: " + landSize + " acres";
    }
}