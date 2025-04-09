package com.xworkz.ToString.internal;

public class Gold {
   private String purity;
   private double weight; // in grams
   private double price;

    public Gold(String purity, double weight, double price) {
        this.purity = purity;
        this.weight = weight;
        this.price = price;
    }

    public String toString() {
        return "Gold: " + purity + ", Weight: " + weight + "g, Price per Gram: ₹" + price
                ;
    }
}
