package com.xworkz.ToString.internal;

public class Photographer {
   private String name;
   private String cameraBrand;
   private int eventsCovered;

    public Photographer(String name, String cameraBrand, int eventsCovered) {
        this.name = name;
        this.cameraBrand = cameraBrand;
        this.eventsCovered = eventsCovered;
    }

    public String toString() {
        return "Photographer: " + name + ", Camera Brand: " + cameraBrand + ", Events Covered: " + eventsCovered;
    }
}

