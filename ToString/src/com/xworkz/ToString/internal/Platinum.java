package com.xworkz.ToString.internal;

public class Platinum {
   private String grade;
   private double weight;
   private double pricePerGram;

    public Platinum(String grade, double weight, double pricePerGram) {
        this.grade = grade;
        this.weight = weight;
        this.pricePerGram = pricePerGram;
    }

    public String toString() {
        return "Platinum: " + grade + ", Weight: " + weight + "Price per Gram:" + pricePerGram;
    }
    @Override
    public int hashCode() {
        return 171;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Platinum) {
                System.out.println("Reference of Platinum will be compared");
                Platinum p1 = this;
                Platinum p2 = (Platinum) obj;
                if (p1.grade.equals(p2.grade)) {
                    System.out.println("Both platinum items are same");
                    return true;
                }
            }
        }
        return false;
    }

}
