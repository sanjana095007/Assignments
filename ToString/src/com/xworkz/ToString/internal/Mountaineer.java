package com.xworkz.ToString.internal;

public class Mountaineer {
   private String name;
   private int peaksClimbed;
   private int yearsOfExperience;

    public Mountaineer(String name, int peaksClimbed, int yearsOfExperience) {
        this.name = name;
        this.peaksClimbed = peaksClimbed;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String toString() {
        return "Mountaineer: " + name + ", Peaks Climbed: " + peaksClimbed + ", Experience: " + yearsOfExperience + " years";
    }
}

