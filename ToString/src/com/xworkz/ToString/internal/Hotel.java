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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Hotel) {
                System.out.println("Reference of Hotel will be compared");
                Hotel hotel = this;
                Hotel hotel1 = (Hotel) obj;
                if (hotel.name.equals(hotel1.name) && hotel.cuisine == hotel1.cuisine) {
                    System.out.println("Both hotels are same");
                    return true;
                }
            }
        }
        return false;
    }


}

