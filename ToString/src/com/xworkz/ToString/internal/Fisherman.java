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
}
