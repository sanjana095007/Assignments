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
    @Override
    public int hashCode() {
        return 131;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Farmer) {
                System.out.println("Reference of Farmer will be compared");
                Farmer farmer = this;
                Farmer farmer1 = (Farmer) obj;
                if (farmer.name.equals(farmer1.name) && farmer.crop.equals(farmer1.crop) && farmer.landSize == farmer1.landSize) {
                    System.out.println("Both farmers are same");
                    return true;
                }
            }
        }
        return false;
    }

}