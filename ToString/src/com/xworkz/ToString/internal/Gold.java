package com.xworkz.ToString.internal;

public class Gold {
   private String weightpurity;
   private double weight;
   private double price;

    public Gold(String weightpurity, double weight, double price) {
        this.weightpurity = weightpurity;
        this.weight = weight;
        this.price = price;
    }

    public String toString() {
        return "Gold: " + weight + ", Weight: " + weight + "Price:" + price;
    }
    @Override
    public int hashCode() {
        return 142;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Gold) {
                System.out.println("Reference of Gold will be compared");
                Gold gold = this;
                Gold gold1 = (Gold) obj;
                if (gold.weightpurity.equals(gold1.weightpurity) && gold.weight == gold1.weight ) {
                    System.out.println("Both gold items are same");
                    return true;
                }
            }
        }
        return false;
    }

}
