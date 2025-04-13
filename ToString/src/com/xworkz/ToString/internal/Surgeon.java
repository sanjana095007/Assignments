package com.xworkz.ToString.internal;

public class Surgeon {
    private String name;
    private String specialization;
    private int surgeriesPerformed;

    public Surgeon(String name, String specialization, int surgeriesPerformed) {
        this.name = name;
        this.specialization = specialization;
        this.surgeriesPerformed = surgeriesPerformed;
    }

    public String toString() {
        return "Surgeon: " + name + ", Specialization: " + specialization + ", Surgeries Performed: " + surgeriesPerformed;
    }
    @Override
    public int hashCode() {
        return 183;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Surgeon) {
                System.out.println("Reference of Surgeon will be compared");
                Surgeon surgeon = this;
                Surgeon surgeon1 = (Surgeon) obj;
                if (surgeon.name.equals(surgeon1.name)) {
                    System.out.println("Both surgeons are same");
                    return true;
                }
            }
        }
        return false;
    }


}
