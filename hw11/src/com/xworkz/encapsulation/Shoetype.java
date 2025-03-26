package com.xworkz.encapsulation;

public class Shoetype {
    static String shoestype;
    public void Type(Shoe shoe) {
        shoe.setBrand("puma");
        shoe.setPrice(5000);
    }
    static {
        shoestype="sports";
        System.out.println("the type of the shoe is "+shoestype +" shoes");
        System.out.println("this is a static block");
    }

}
