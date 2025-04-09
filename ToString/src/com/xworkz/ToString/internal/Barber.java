package com.xworkz.ToString.internal;

public class Barber {
    private String name;
    private int experience;
    private String shopName;

    public Barber(String name, int experience, String shopName) {
        this.name = name;
        this.experience = experience;
        this.shopName = shopName;
    }

    public String toString() {
        return "Barber: " + name + ", Experience: " + experience + " years, Shop: " + shopName;
    }
}

