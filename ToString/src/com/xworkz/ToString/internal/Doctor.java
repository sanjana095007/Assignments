package com.xworkz.ToString.internal;

public class Doctor {
   private String name;
   private String specialization;
   private int patientsTreated;

    public Doctor(String name, String specialization, int patientsTreated) {
        this.name = name;
        this.specialization = specialization;
        this.patientsTreated = patientsTreated;
    }

    public String toString() {
        return "Doctor: " + name + ", Specialization: " + specialization + ", Patients Treated: " + patientsTreated;
    }
}
