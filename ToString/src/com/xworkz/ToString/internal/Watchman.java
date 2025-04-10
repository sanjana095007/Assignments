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
}
