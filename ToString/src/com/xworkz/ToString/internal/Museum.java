package com.xworkz.ToString.internal;

public class Museum {
    private String name;
    private String location;
    private int exhibits;

    public Museum(String name, String location, int exhibits) {
        this.name = name;
        this.location = location;
        this.exhibits = exhibits;
    }

    public String toString() {
        return "Museum: " + name + ", Location: " + location + ", Exhibits: " + exhibits;
    }
}