package com.xworkz.Interface.Internal;

public class SportShoes implements Shoes{
    @Override
    public void laceUp() {
        System.out.println("running the laceUp method");
    }

    @Override
    public void walk() {
        System.out.println("running the walk method");
    }

    @Override
    public void polish() {
        System.out.println("running the polish method");
    }
}
