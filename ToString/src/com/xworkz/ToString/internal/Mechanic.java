package com.xworkz.ToString.internal;

public class Mechanic {
   private String name;
   private String garage;
   private int vehiclesRepaired;

    public Mechanic(String name, String garage, int vehiclesRepaired) {
        this.name = name;
        this.garage = garage;
        this.vehiclesRepaired = vehiclesRepaired;
    }

    public String toString() {
        return "Mechanic: " + name + ", Garage: " + garage + ", Vehicles Repaired: " + vehiclesRepaired;
    }
    @Override
    public int hashCode() {
        return 156;
    }
}
