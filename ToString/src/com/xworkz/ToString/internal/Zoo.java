package com.xworkz.ToString.internal;

public class Zoo {
    private String name;
    private String city;
    private int animals;

    public Zoo(String name, String city, int animals) {
        this.name = name;
        this.city = city;
        this.animals = animals;
    }

    public String toString() {
        return "Zoo name: " + name + ", City: " + city + ", Animals: " + animals;
    }
}

