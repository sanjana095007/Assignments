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
}
