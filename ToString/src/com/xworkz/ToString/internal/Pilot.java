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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Pilot) {
                System.out.println("Reference of Pilot will be compared");
                Pilot pilot = this;
                Pilot pilot1 = (Pilot) obj;
                if (pilot.name.equals(pilot1.name) && pilot.airline.equals(pilot1.airline)) {
                    System.out.println("Both pilots are same");
                    return true;
                }
            }
        }
        return false;
    }

}
