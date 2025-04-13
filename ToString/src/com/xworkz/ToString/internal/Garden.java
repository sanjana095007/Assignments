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
    @Override
    public int hashCode() {
        return 141;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Garden) {
                System.out.println("Reference of Garden will be compared");
                Garden garden = this;
                Garden garden1 = (Garden) obj;
                if (garden.name.equals(garden1.name) && garden.gardenType.equals(garden1.gardenType)) {
                    System.out.println("Both gardens are same");
                    return true;
                }
            }
        }
        return false;
    }

}
