package com.xworkz.ToString.internal;

public class Garden {
   private String name;
   private String gardenType;
   private int plantsGrown;

    public Garden(String name, String gardenType, int plantsGrown) {
        this.name = name;
        this.gardenType = gardenType;
        this.plantsGrown = plantsGrown;
    }

    public String toString() {
        return "Gardener: " + name + ", Garden Type: " + gardenType + ", Plants Grown: " + plantsGrown;
    }
}
