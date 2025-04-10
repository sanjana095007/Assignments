package com.xworkz.ToString.internal;

public class Temple {
    private String name;
    private String country;
    private String city;

    public Temple(String name, String country, String city) {
        this.name = name;
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "name: " + name + ", country: " + country + ", City: " + city;
    }
    @Override
    public int hashCode() {
        return 188;
    }
}
