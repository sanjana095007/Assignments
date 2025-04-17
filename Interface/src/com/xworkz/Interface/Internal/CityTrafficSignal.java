package com.xworkz.Interface.Internal;

public class CityTrafficSignal implements TrafficSignal{
    @Override
    public void turnGreen() {
        System.out.println("running the turn Green method");
    }

    @Override
    public void turnRed() {
        System.out.println("running the turn Red method");
    }

    @Override
    public void turnYellow() {
        System.out.println("running the turn Yellow method");
    }
}
