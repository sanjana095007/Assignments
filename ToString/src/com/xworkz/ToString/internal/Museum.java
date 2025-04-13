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
    @Override
    public int hashCode() {
        return 161;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Museum) {
                System.out.println("Reference of Museum will be compared");
                Museum museum = this;
                Museum museum1 = (Museum) obj;
                if (museum.name.equals(museum1.name) && museum.location.equals(museum1.location) ) {
                    System.out.println("Both museums are same");
                    return true;
                }
            }
        }
        return false;
    }

}