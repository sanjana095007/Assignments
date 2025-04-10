package com.xworkz.ToString.internal;

public class Gold {
   private String purity;
   private double weight;
   private double price;

    public Gold(String purity, double weight, double price) {
        this.purity = purity;
        this.weight = weight;
        this.price = price;
    }

    public String toString() {
        return "Gold: " + purity + ", Weight: " + weight + "Price:" + price;
    }
    @Override
    public int hashCode() {
        return 142;
    }
}
