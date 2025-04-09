package com.xworkz.ToString.internal;

public class Mall {
   private String name;
   private String location;
   private int numberOfShops;

    public Mall(String name, String location, int numberOfShops) {
        this.name = name;
        this.location = location;
        this.numberOfShops = numberOfShops;
    }

    public String toString() {
        return "Mall: " + name + ", Location: " + location + ", Number of Shops: " + numberOfShops;
    }
}
