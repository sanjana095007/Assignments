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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof House) {
                System.out.println("Reference of House will be compared");
                House house = this;
                House house1 = (House) obj;
                if (house.address.equals(house1.address) && house.bedrooms == house1.bedrooms ) {
                    System.out.println("Both houses are same");
                    return true;
                }
            }
        }
        return false;
    }

}

