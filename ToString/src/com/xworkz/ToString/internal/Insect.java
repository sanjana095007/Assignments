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
}
