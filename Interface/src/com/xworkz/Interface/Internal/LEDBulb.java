package com.xworkz.Interface.Internal;

public class LEDBulb implements Bulb{
    @Override
    public void turnOn() {
        System.out.println("running the turnOn method");
    }

    @Override
    public void turnOff() {
        System.out.println("running the turnOff method");
    }

    @Override
    public void changeColor() {
        System.out.println("running the change Color method");
    }
}
