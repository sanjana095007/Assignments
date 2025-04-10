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
}

