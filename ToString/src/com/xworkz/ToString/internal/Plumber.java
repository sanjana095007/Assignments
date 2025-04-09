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
}
