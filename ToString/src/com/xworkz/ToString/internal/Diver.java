package com.xworkz.ToString.internal;

public class Diver {
   private String name;
   private int depth;
   private String certification;

    public Diver(String name, int depth, String certification) {
        this.name = name;
        this.depth = depth;
        this.certification = certification;
    }

    public String toString() {
        return "Diver: " + name + ", Depth: " + depth + "m, Certification: " + certification;
    }
}
