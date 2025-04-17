package com.xworkz.Interface.Internal;

public class Visa implements CreditCard{
    @Override
    public void swipe() {
        System.out.println("running the swipe method");
    }

    @Override
    public void tap() {
        System.out.println("running the tap method");
    }

    @Override
    public void enterPin() {
        System.out.println("running the enter Pin method");
    }
}
