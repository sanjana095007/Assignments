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
}

