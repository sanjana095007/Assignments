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
}

