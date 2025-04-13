package com.xworkz.ToString.internal;

public class Mobile {
    private String brand;
    private String model;
    private double price;

    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand :"+brand+" "+ "model :"+model+" "+"price :"+price;
    }
    @Override
    public int hashCode() {
        return 158;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Mobile) {
                System.out.println("Reference of Mobile will be compared");
                Mobile mobile = this;
                Mobile mobile1 = (Mobile) obj;
                if (mobile.brand.equals(mobile1.brand) && mobile.model.equals(mobile1.model) ) {
                    System.out.println("Both mobiles are same");
                    return true;
                }
            }
        }
        return false;
    }

}

