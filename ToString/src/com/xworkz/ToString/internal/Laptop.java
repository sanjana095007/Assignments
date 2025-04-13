package com.xworkz.ToString.internal;

public class Laptop {
    private String brand;
    private int  price;
    private int ramGB;

    public Laptop(String brand, int price, int ramGB) {
        this.brand = brand;
        this.price = price;
        this.ramGB = ramGB;
    }

    @Override
    public String toString() {
        return "brand :"+brand+" "+ "price :"+price+" "+"ramGB :"+ramGB;
    }
    @Override
    public int hashCode() {
        return 151;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof Laptop) {
                System.out.println("Reference of Laptop will be compared");
                Laptop laptop = this;
                Laptop laptop1 = (Laptop) obj;
                if (laptop.brand.equals(laptop1.brand) && laptop.price == laptop1.price ) {
                    System.out.println("Both laptops are same");
                    return true;
                }
            }
        }
        return false;
    }

}

