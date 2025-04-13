package com.xworkz.ToString.internal;

public class Carpenter {
    private String name;
    private int experience;
    private String specialty;

    public Carpenter(String name, int experience, String specialty) {
        this.name = name;
        this.experience = experience;
        this.specialty = specialty;
    }

    public String toString() {
        return "Carpenter name: " + name + ", Experience: " + experience + " years, Specialty: " + specialty;
    }
    @Override
    public int hashCode() {
        return 115;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Carpenter) {
                System.out.println("Reference of Carpenter will be compared");
                Carpenter carpenter = this;
                Carpenter carpenter1 = (Carpenter) obj;
                if (carpenter.name.equals(carpenter1.name) && carpenter.experience == carpenter1.experience && carpenter.specialty.equals(carpenter1.specialty)) {
                    System.out.println("Both carpenters are same");
                    return true;
                }
            }
        }
        return false;
    }

}
