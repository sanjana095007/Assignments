package com.xworkz.ToString.internal;

public class Milkman {
   private String name;
   private int litersDeliveredDaily;
   private String deliveryArea;

    public Milkman(String name, int litersDeliveredDaily, String deliveryArea) {
        this.name = name;
        this.litersDeliveredDaily = litersDeliveredDaily;
        this.deliveryArea = deliveryArea;
    }

    public String toString() {
        return "Milkman: " + name + ", Liters Delivered Daily: " + litersDeliveredDaily + ", Area: " + deliveryArea;
    }
    @Override
    public int hashCode() {
        return 157;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Milkman) {
                System.out.println("Reference of Milkman will be compared");
                Milkman milkman = this;
                Milkman milkman1 = (Milkman) obj;
                if (milkman.name.equals(milkman1.name) && milkman.litersDeliveredDaily == milkman1.litersDeliveredDaily ) {
                    System.out.println("Both milkmen are same");
                    return true;
                }
            }
        }
        return false;
    }


}

