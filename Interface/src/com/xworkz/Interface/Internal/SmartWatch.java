package com.xworkz.Interface.Internal;

public class SmartWatch implements Watch{
    @Override
    public void showTime() {
        System.out.println("running the showTime method");
    }

    @Override
    public void setAlarm() {
        System.out.println("running the setAlarm method");
    }

    @Override
    public void changeBattery() {
        System.out.println("running the change Battery method");
    }
}
