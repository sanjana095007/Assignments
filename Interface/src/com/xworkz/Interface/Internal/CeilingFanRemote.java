package com.xworkz.Interface.Internal;

public class CeilingFanRemote implements FanRemote {
    @Override
    public void turnOn() {
        System.out.println("running the turnOn method");
    }

    @Override
    public void turnOff() {
        System.out.println("running the turn Off method");
    }

    @Override
    public void changeSpeed() {
        System.out.println("running the change Speed method");
    }
}
