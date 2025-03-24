package com.xworkz.access;

public class Details {
    Product product=new Product();
    public void display(){
        product.productName="shoes";
        product.price=2053;;

        System.out.println("The name of the product is :"+product.productName);
        System.out.println("price: " + product.price);
        product.setName();
    }
}
