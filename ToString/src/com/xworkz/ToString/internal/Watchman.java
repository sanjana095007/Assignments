package com.xworkz.ToString.internal;

public class Watchman {
    private String name;
    private String apartmentName;
    private int hoursPerShift;

    public Watchman(String name, String apartmentName, int hoursPerShift) {
        this.name = name;
        this.apartmentName = apartmentName;
        this.hoursPerShift = hoursPerShift;
    }

    public String toString() {
        return "Watchman: " + name + ", Apartment: " + apartmentName + ", Shift Hours: " + hoursPerShift;
    }
    @Override
    public int hashCode() {
        return 196;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Watchman) {
                System.out.println("Reference of Watchman will be compared");
                Watchman Watchman = this;
                Watchman Watchman1 = (Watchman) obj;
                if (Watchman.name.equals(Watchman1.name)) {
                    System.out.println("Both watchmen are same");
                    return true;
                }
            }
        }
        return false;
    }

}
