package com.xworkz.Interface.Internal;

public class MountainBicycle implements Bicycle{
    @Override
    public void pedal() {
        System.out.println("running the pedal method");
    }

    @Override
    public void brake() {
        System.out.println("running the brake method");
    }

    @Override
    public void ringBell() {
        System.out.println("running the ringBell method");
    }
}
