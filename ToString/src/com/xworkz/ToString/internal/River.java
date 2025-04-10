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
}

