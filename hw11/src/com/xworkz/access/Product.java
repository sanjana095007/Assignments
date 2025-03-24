package com.xworkz.access;

public class Product {
    public String productName;
    double price;
    private String Details;

    public void setName() {
        System.out.println("The name of the product is :"+productName);
        this.Details="shoe";
        System.out.println("the details of the product is "+this.Details+ "from the puma");
    }

    void setPrice() {
        System.out.println("price of item : " + price);
    }

    private void information() {
        System.out.println("the details of the product is "+this.Details+" from the puma");
    }
}
