package com.xworkz.ToString.internal;

public class Platinum {
   private String grade;
   private double weight; // in grams
   private double pricePerGram;

    public Platinum(String grade, double weight, double pricePerGram) {
        this.grade = grade;
        this.weight = weight;
        this.pricePerGram = pricePerGram;
    }

    public String toString() {
        return "Platinum: " + grade + ", Weight: " + weight + "g, Price per Gram: ₹" + pricePerGram;
    }
}
