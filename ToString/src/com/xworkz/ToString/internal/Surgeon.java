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
}
