package com.xworkz.ToString.internal;

public class Dancer {
   private String name;
   private String danceForm;
   private int performances;

    public Dancer(String name, String danceForm, int performances) {
        this.name = name;
        this.danceForm = danceForm;
        this.performances = performances;
    }

    public String toString() {
        return "Dancer: " + name + ", Dance Form: " + danceForm + ", Performances: " + performances;
    }
    @Override
    public int hashCode() {
        return 123;
    }
}

