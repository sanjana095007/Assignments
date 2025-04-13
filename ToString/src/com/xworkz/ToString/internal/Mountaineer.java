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
    @Override
    public int hashCode() {
        return 159;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Mountaineer) {
                System.out.println("Reference of Mountaineer will be compared");
                Mountaineer mountaineer = this;
                Mountaineer mountaineer1 = (Mountaineer) obj;
                if (mountaineer.name.equals(mountaineer1.name) && mountaineer.peaksClimbed == mountaineer1.peaksClimbed) {
                    System.out.println("Both mountaineers are same");
                    return true;
                }
            }
        }
        return false;
    }

}

