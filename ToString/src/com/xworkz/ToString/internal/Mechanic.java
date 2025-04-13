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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Mechanic) {
                System.out.println("Reference of Mechanic will be compared");
                Mechanic mechanic = this;
                Mechanic mechanic1 = (Mechanic) obj;
                if (mechanic.name.equals(mechanic1.name) && mechanic.garage.equals(mechanic1.garage)) {
                    System.out.println("Both mechanics are same");
                    return true;
                }
            }
        }
        return false;
    }

}
