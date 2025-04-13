package com.xworkz.ToString.internal;

public class Bike {
    private String brand;
    private String type;
    private double price;

    public Bike(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand :" + brand + " " + "type :" + type + " " + "price :" + price;
    }
    @Override
    public int hashCode() {
        return 109;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Bike) {
                System.out.println("Reference of Bike will be compared");
                Bike bike = this;
                Bike bike1 = (Bike) obj;
                if (bike.brand.equals(bike1.brand) && bike.type.equals(bike1.type) && bike.price == bike1.price) {
                    System.out.println("Both bikes are same");
                    return true;
                }
            }
        }
        return false;
    }

}
