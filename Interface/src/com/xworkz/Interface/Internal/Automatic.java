package com.xworkz.Interface.Internal;

public class Automatic implements WashingMachine{
    @Override
    public void wash() {
        System.out.println("running the wash method");
    }

    @Override
    public void rinse() {
        System.out.println("running the rinse method");
    }

    @Override
    public void spin() {
        System.out.println("running the spin method");
    }
}
