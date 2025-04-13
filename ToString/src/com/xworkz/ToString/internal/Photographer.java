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
    @Override
    public int hashCode() {
        return 168;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Photographer) {
                System.out.println("Reference of Photographer will be compared");
                Photographer photographer = this;
                Photographer photographer1 = (Photographer) obj;
                if (photographer.name.equals(photographer1.name) && photographer.cameraBrand.equals(photographer1.cameraBrand)) {
                    System.out.println("Both photographers are same");
                    return true;
                }
            }
        }
        return false;
    }

}

