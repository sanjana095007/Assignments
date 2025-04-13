package com.xworkz.ToString.internal;

public class Plumber {
    private String name;
    private int experienceYears;
    private int repairsDone;

    public Plumber(String name, int experienceYears, int repairsDone) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.repairsDone = repairsDone;
    }

    public String toString() {
        return "Plumber: " + name + ", Experience: " + experienceYears + " years, Repairs Done: " + repairsDone;
    }
    @Override
    public int hashCode() {
        return 172;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Plumber) {
                System.out.println("Reference of Plumber will be compared");
                Plumber plumber = this;
                Plumber plumber1 = (Plumber) obj;
                if (plumber.name.equals(plumber1.name)) {
                    System.out.println("Both plumbers are same");
                    return true;
                }
            }
        }
        return false;
    }

}
