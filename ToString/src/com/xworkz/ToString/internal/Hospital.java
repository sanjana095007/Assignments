package com.xworkz.ToString.internal;

public class Hospital {
    private String name;
    private String city;
    private int capacity;

    public Hospital(String name, String city, int capacity) {
        this.name = name;
        this.city = city;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Hospital: " + name + ", City: " + city + ", Capacity: " + capacity;
    }
    @Override
    public int hashCode() {
        return 144;
    }
}

