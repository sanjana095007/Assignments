package com.xworkz.ToString.internal;

public class Nurse {
   private String name;
   private String department;
   private int yearsOfService;

    public Nurse(String name, String department, int yearsOfService) {
        this.name = name;
        this.department = department;
        this.yearsOfService = yearsOfService;
    }

    public String toString() {
        return "Nurse: " + name + ", Department: " + department + ", Years of Service: " + yearsOfService;
    }
    @Override
    public int hashCode() {
        return 164;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Nurse) {
                System.out.println("Reference of Nurse will be compared");
                Nurse nurse = this;
                Nurse nurse1 = (Nurse) obj;
                if (nurse.name.equals(nurse1.name) && nurse.department.equals(nurse1.department) ) {
                    System.out.println("Both nurses are same");
                    return true;
                }
            }
        }
        return false;
    }

}

