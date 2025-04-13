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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Dancer) {
                System.out.println("Reference of Dancer will be compared");
                Dancer dancer = this;
                Dancer dancer1 = (Dancer) obj;
                if (dancer.name.equals(dancer1.name) && dancer.danceForm.equals(dancer1.danceForm) && dancer.performances == dancer1.performances) {
                    System.out.println("Both dancers are same");
                    return true;
                }
            }
        }
        return false;
    }

}

