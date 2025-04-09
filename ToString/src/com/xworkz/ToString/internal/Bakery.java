package com.xworkz.ToString.internal;

public class Bakery {
    private String name;
    private String bakery;
    private int itemsBaked;

    public Bakery(String name, String bakery, int itemsBaked) {
        this.name = name;
        this.bakery = bakery;
        this.itemsBaked = itemsBaked;
    }

    public String toString() {
        return "Baker: " + name + ", Bakery: " + bakery + ", Items Baked: " + itemsBaked;
    }
}

