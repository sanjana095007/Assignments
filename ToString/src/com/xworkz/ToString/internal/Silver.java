package com.xworkz.ToString.internal;

public class Silver {
    private String purity;
    private double weight; // in grams
    private double pricePerGram;

    public Silver(String purity, double weight, double pricePerGram) {
        this.purity = purity;
        this.weight = weight;
        this.pricePerGram = pricePerGram;
    }

    public String toString() {
        return "Silver: " + purity + ", Weight: " + weight + "g, Price per Gram: ₹" + pricePerGram;
    }
}
