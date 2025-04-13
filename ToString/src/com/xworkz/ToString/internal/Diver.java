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
    @Override
    public int hashCode() {
        return 126;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Diver) {
                System.out.println("Reference of Diver will be compared");
                Diver diver = this;
                Diver diver1 = (Diver) obj;
                if (diver.name.equals(diver1.name) && diver.depth == diver1.depth && diver.certification.equals(diver1.certification)) {
                    System.out.println("Both divers are same");
                    return true;
                }
            }
        }
        return false;
    }

}
