package com.xworkz.Interface.Internal;

public class CeilingFan implements Fan {
    @Override
    public void turnOn() {
        System.out.println("running the turnOn method");
    }

    @Override
    public void turnOff() {
        System.out.println("running the turnOff method");
    }

    @Override
    public void adjustSpeed() {
        System.out.println("running the adjustSpeed method");
    }

    @Override
    public void showType() {
        System.out.println("running the showType method");

    }
}
