package com.xworkz.ToString.internal;

public class Insect {
   private String name;
   private int legs;
   private boolean isHarmful;

    public Insect(String name, int legs, boolean isHarmful) {
        this.name = name;
        this.legs = legs;
        this.isHarmful = isHarmful;
    }

    public String toString() {
        return "Insect: " + name + ", Legs: " + legs + ", Harmful: " + isHarmful;
    }
    @Override
    public int hashCode() {
        return 148;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Insect) {
                System.out.println("Reference of Insect will be compared");
                Insect insect = this;
                Insect insect1 = (Insect) obj;
                if (insect.name.equals(insect1.name) && insect.legs == insect1.legs) {
                    System.out.println("Both insects are same");
                    return true;
                }
            }
        }
        return false;
    }

}
