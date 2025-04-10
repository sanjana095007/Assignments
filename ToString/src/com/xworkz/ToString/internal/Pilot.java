package com.xworkz.ToString.internal;

public class Pilot {
    private String name;
    private String airline;
    private int flyingHours;

    public Pilot(String name, String airline, int flyingHours) {
        this.name = name;
        this.airline = airline;
        this.flyingHours = flyingHours;
    }

    public String toString() {
        return "Pilot: " + name + ", Airline: " + airline + ", Flying Hours: " + flyingHours;
    }
    @Override
    public int hashCode() {
        return 169;
    }
}
