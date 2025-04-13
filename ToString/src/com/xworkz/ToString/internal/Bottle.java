package com.xworkz.ToString.internal;

public class Bottle {
   private String type;
   private int capacity;
   private boolean isReusable;

    public Bottle(String type, int capacity, boolean isReusable) {
        this.type = type;
        this.capacity = capacity;
        this.isReusable = isReusable;
    }

    public String toString() {
        return "Bottle - Type: " + type + ", Capacity: " + capacity + " ml, Reusable: " + isReusable;
    }
    @Override
    public int hashCode() {
        return 112;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Bottle) {
                System.out.println("Reference of Bottle will be compared");
                Bottle bottle = this;
                Bottle bottle1 = (Bottle) obj;
                if (bottle.type.equals(bottle1.type) && bottle.capacity == bottle1.capacity && bottle.isReusable == bottle1.isReusable) {
                    System.out.println("Both bottles are same");
                    return true;
                }
            }
        }
        return false;
    }

}
