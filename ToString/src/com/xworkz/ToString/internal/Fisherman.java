package com.xworkz.ToString.internal;

public class Fisherman {
   private String name;
   private String river;
   private int fishCaught;

    public Fisherman(String name, String river, int fishCaught) {
        this.name = name;
        this.river = river;
        this.fishCaught = fishCaught;
    }

    public String toString() {
        return "Fisherman: " + name + ", River: " + river + ", Fish Caught: " + fishCaught;
    }
    @Override
    public int hashCode() {
        return 135;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Fisherman) {
                System.out.println("Reference of Fisherman will be compared");
                Fisherman fisherman = this;
                Fisherman fisherman1 = (Fisherman) obj;
                if (fisherman.name.equals(fisherman1.name) && fisherman.river.equals(fisherman1.river) && fisherman.fishCaught == fisherman1.fishCaught) {
                    System.out.println("Both fishermen are same");
                    return true;
                }
            }
        }
        return false;
    }

}
