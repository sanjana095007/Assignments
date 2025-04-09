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
}

