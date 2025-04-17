package com.xworkz.Interface.Internal;

public class LEDFlashlight implements Flashlight {
    @Override
    public void turnOn() {
        System.out.println("running the turnOn method");
    }

    @Override
    public void turnOff() {
        System.out.println("running the turnOff method");
    }

    @Override
    public void changeBattery() {
        System.out.println("running the change Battery method");
    }
}
