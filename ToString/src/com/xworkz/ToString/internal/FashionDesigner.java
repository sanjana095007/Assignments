package com.xworkz.ToString.internal;

public class FashionDesigner {
    private String name;
    private String brand;
    private int collections;

    public FashionDesigner(String name, String brand, int collections) {
        this.name = name;
        this.brand = brand;
        this.collections = collections;
    }

    public String toString() {
        return "FashionDesigner: " + name + ", Brand: " + brand + ", Collections: " + collections;
    }
    @Override
    public int hashCode() {
        return 132;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Checking for null reference");
            if (obj instanceof FashionDesigner) {
                System.out.println("Reference of FashionDesigner will be compared");
                FashionDesigner designer = this;
                FashionDesigner designer1 = (FashionDesigner) obj;
                if (designer.name.equals(designer1.name) && designer.brand.equals(designer1.brand) && designer.collections == designer1.collections) {
                    System.out.println("Both fashion designers are same");
                    return true;
                }
            }
        }
        return false;
    }

}
