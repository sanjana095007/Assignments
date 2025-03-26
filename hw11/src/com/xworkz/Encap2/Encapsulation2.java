package com.xworkz.Encap2;

import com.xworkz.encapsulation.Shoe;

public class Encapsulation2 {
    public void display(Shoe shoes){
        System.out.println("the shoes brand is :"+shoes.getBrand());
        System.out.println("the price of the "+shoes.getBrand()+" is : " +shoes.getPrice());
    }
}
