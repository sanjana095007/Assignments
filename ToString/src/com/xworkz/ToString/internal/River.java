package com.xworkz.ToString.internal;

public class River {
    private String name;
    private double length;
    private String origin;

    public River(String name, double length, String origin) {
        this.name = name;
        this.length = length;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "River: " + name + ", Length: " + length + " km, Origin: " + origin;
    }
    @Override
    public int hashCode() {
        return 177;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof River) {
                System.out.println("Reference of River will be compared");
                River river = this;
                River river1 = (River) obj;
                if (river.name.equals(river1.name) ) {
                    System.out.println("Both rivers are same");
                    return true;
                }
            }
        }
        return false;
    }

}

