package com.xworkz.ToString.internal;

public class Television {
    private String brand;
    private int sizeInInches;
    private boolean isSmartTV;

    public Television(String brand, int sizeInInches, boolean isSmartTV) {
        this.brand = brand;
        this.sizeInInches = sizeInInches;
        this.isSmartTV = isSmartTV;
    }

    public String toString() {
        return "Television - Brand: " + brand + ", Size: " + sizeInInches + " inch, Smart TV: " + isSmartTV;
    }
    @Override
    public int hashCode() {
        return 187;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Television) {
                System.out.println("Reference of Television will be compared");
                Television television = this;
                Television television1 = (Television) obj;
                if (television.brand.equals(television1.brand)) {
                    System.out.println("Both televisions are same");
                    return true;
                }
            }
        }
        return false;
    }


}
