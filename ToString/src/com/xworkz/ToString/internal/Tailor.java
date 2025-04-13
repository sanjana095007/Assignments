package com.xworkz.ToString.internal;

public class Tailor {
    private String name;
    private String shopName;
    private int clothesStitched;

    public Tailor(String name, String shopName, int clothesStitched) {
        this.name = name;
        this.shopName = shopName;
        this.clothesStitched = clothesStitched;
    }

    public String toString() {
        return "Tailor: " + name + ", Shop: " + shopName + ", Clothes Stitched: " + clothesStitched;
    }
    @Override
    public int hashCode() {
        return 185;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Tailor) {
                System.out.println("Reference of Tailor will be compared");
                Tailor tailor = this;
                Tailor tailor1 = (Tailor) obj;
                if (tailor.name.equals(tailor1.name)) {
                    System.out.println("Both tailors are same");
                    return true;
                }
            }
        }
        return false;
    }

}

