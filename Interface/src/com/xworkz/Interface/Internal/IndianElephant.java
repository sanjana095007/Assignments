package com.xworkz.Interface.Internal;

public class IndianElephant implements Elephant{
    @Override
    public void trumpet() {
        System.out.println("running the trumpet method");
    }

    @Override
    public void carryLoad() {
        System.out.println("running the carry Load method");
    }

    @Override
    public void sprayWater() {
        System.out.println("running the spray Water method");
    }

    @Override
    public void displaySize() {
        System.out.println("running the displaySize method");
    }
}
