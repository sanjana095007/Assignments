package com.xworkz.Interface.Internal;

public class DoubleDoorFridge implements Fridge{
    @Override
    public void cool() {
        System.out.println("running the cool method");
    }

    @Override
    public void defrost() {
        System.out.println("running the defrost method");
    }

    @Override
    public void storeFood() {
        System.out.println("running the store Food method");
    }
}
