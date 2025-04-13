package com.xworkz.ToString.internal;

public class Lawyer {
   private String name;
   private String court;
   private int casesHandled;

    public Lawyer(String name, String court, int casesHandled) {
        this.name = name;
        this.court = court;
        this.casesHandled = casesHandled;
    }

    public String toString() {
        return "Lawyer: " + name + ", Court: " + court + ", Cases Handled: " + casesHandled;
    }
    @Override
    public int hashCode() {
        return 152;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Lawyer) {
                System.out.println("Reference of Lawyer will be compared");
                Lawyer lawyer = this;
                Lawyer lawyer1 = (Lawyer) obj;
                if (lawyer.name.equals(lawyer1.name) && lawyer.court.equals(lawyer1.court) ) {
                    System.out.println("Both lawyers are same");
                    return true;
                }
            }
        }
        return false;
    }

}

