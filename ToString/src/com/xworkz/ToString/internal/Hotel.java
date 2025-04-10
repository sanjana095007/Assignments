package com.xworkz.ToString.internal;

public class Hotel {
    private String name;
    private String cuisine;
    private double rating;

    public Hotel(String name, String cuisine, double rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "name: " + name + ", Cuisine: " + cuisine + ", Rating: " + rating;
    }
    @Override
    public int hashCode() {
        return 145;
    }
}

