package com.xworkz.ToString.internal;

public class Engineer {
   private String name;
   private String field;
   private int projectsCompleted;

    public Engineer(String name, String field, int projectsCompleted) {
        this.name = name;
        this.field = field;
        this.projectsCompleted = projectsCompleted;
    }

    public String toString() {
        return "Engineer: " + name + ", Field: " + field + ", Projects Completed: " + projectsCompleted;
    }
    @Override
    public int hashCode() {
        return 129;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Engineer) {
                System.out.println("Reference of Engineer will be compared");
                Engineer engineer = this;
                Engineer engineer1 = (Engineer) obj;
                if (engineer.name.equals(engineer1.name) && engineer.field.equals(engineer1.field) && engineer.projectsCompleted == engineer1.projectsCompleted) {
                    System.out.println("Both engineers are same");
                    return true;
                }
            }
        }
        return false;
    }

}
