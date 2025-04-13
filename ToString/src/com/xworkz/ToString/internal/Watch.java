package com.xworkz.ToString.internal;

public class Watch {
    private String brand;
    private String type;
    private double price;

    public Watch(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public String toString() {
        return "Watch brand: " + brand + ", Type: " + type + ", Price: " + price;
    }
    @Override
    public int hashCode() {
        return 195;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Watch) {
                System.out.println("Reference of Watch will be compared");
                Watch Watch = this;
                Watch Watch1 = (Watch) obj;
                if (Watch.brand.equals(Watch1.brand)) {
                    System.out.println("Both watches are same");
                    return true;
                }
            }
        }
        return false;
    }

}
