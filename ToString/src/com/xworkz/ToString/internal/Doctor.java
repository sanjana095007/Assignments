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
    @Override
    public int hashCode() {
        return 127;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Doctor) {
                System.out.println("Reference of Doctor will be compared");
                Doctor doctor = this;
                Doctor doctor1 = (Doctor) obj;
                if (doctor.name.equals(doctor1.name) && doctor.specialization.equals(doctor1.specialization) && doctor.patientsTreated == doctor1.patientsTreated) {
                    System.out.println("Both doctors are same");
                    return true;
                }
            }
        }
        return false;
    }

}
