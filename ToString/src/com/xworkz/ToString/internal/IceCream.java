package com.xworkz.ToString.internal;

public class IceCream {
    private String name;
    private String location;
    private int flavors;

    public IceCream(String name, String location, int flavors) {
        this.name = name;
        this.location = location;
        this.flavors = flavors;
    }

    public String toString() {
        return "IceCream: " + name + ", Location: " + location + ", Flavors: " + flavors;
    }
    @Override
    public int hashCode() {
        return 147;
    }
}
