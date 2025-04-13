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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Temple) {
                System.out.println("Reference of Temple will be compared");
                Temple temple = this;
                Temple temple1 = (Temple) obj;
                if (temple.name.equals(temple1.name)) {
                    System.out.println("Both temples are same");
                    return true;
                }
            }
        }
        return false;
    }

}
