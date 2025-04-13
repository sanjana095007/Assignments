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
    @Override
    public int hashCode() {
        return 139;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Furniture) {
                System.out.println("Reference of Furniture will be compared");
                Furniture furniture = this;
                Furniture furniture1 = (Furniture) obj;
                if (furniture.type.equals(furniture1.type) && furniture.material.equals(furniture1.material) && furniture.cost == furniture1.cost) {
                    System.out.println("Both furnitures are same");
                    return true;
                }
            }
        }
        return false;
    }
}