package com.xworkz.Interface.Internal;

public class Kitchen implements Microwave{
    @Override
    public void heat() {
        System.out.println("running the heat method");
    }

    @Override
    public void defrost() {
        System.out.println("running the defrost method");
    }

    @Override
    public void cook() {
        System.out.println("running the cook method");
    }
}
