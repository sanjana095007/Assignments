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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Hospital) {
                System.out.println("Reference of Hospital will be compared");
                Hospital hospital = this;
                Hospital hospital1 = (Hospital) obj;
                if (hospital.name.equals(hospital1.name) && hospital.city.equals(hospital1.city) ) {
                    System.out.println("Both hospitals are same");
                    return true;
                }
            }
        }
        return false;
    }

}

