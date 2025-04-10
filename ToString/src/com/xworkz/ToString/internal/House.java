package com.xworkz.ToString.internal;

public class House {
    private String address;
    private int bedrooms;
    private double area;

    public House(String address, int bedrooms, double area) {
        this.address = address;
        this.bedrooms = bedrooms;
        this.area = area;
    }

    @Override
    public String toString() {
        return "address: " + address + ", bedrooms: " + bedrooms + ", area: " + area;
    }
    @Override
    public int hashCode() {
        return 146;
    }
}

