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
}
