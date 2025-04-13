package com.xworkz.ToString.internal;

public class Silver {
    private String purity;
    private double weight;
    private double pricePerGram;

    public Silver(String purity, double weight, double pricePerGram) {
        this.purity = purity;
        this.weight = weight;
        this.pricePerGram = pricePerGram;
    }

    public String toString() {
        return "Silver: " + purity + ", Weight: " + weight + "Price per Gram:" + pricePerGram;
    }
    @Override
    public int hashCode() {
        return 180;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Silver) {
                System.out.println("Reference of Silver will be compared");
                Silver silver = this;
                Silver silver1 = (Silver) obj;
                if ( silver.purity == silver1.purity) {
                    System.out.println("Both silver items are same");
                    return true;
                }
            }
        }
        return false;
    }


}
