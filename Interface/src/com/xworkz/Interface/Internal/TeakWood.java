package com.xworkz.Interface.Internal;

public class TeakWood implements Wood{
    @Override
    public void cut() {
        System.out.println("running the cut method");
    }

    @Override
    public void polish() {
        System.out.println("running the polish method");
    }

    @Override
    public void burn() {
        System.out.println("running the burn method");
    }

    @Override
    public void displayInfo() {
        System.out.println("running the displayInfo method");
    }
}
