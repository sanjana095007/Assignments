package com.xworkz.Interface.Internal;

public class LEDLight implements Light{
    @Override
    public void turnOn() {
        System.out.println("running the turnOn method");
    }

    @Override
    public void turnOff() {
        System.out.println("running the turnOff method");
    }

    @Override
    public void dim() {
        System.out.println("running the blink method");
    }
}
