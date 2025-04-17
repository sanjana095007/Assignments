package com.xworkz.Interface.Internal;

public class EspressoMachine implements CoffeeMachine {
    @Override
    public void brew() {
        System.out.println("running the brew method");
    }

    @Override
    public void addMilk() {
        System.out.println("running the clean method");
    }

    @Override
    public void clean() {
        System.out.println("running the pour method");
    }
}
