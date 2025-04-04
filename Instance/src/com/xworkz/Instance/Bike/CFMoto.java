package com.xworkz.Instance.Bike;

public class CFMoto extends Bikes {
    public void ride() {

        System.out.println("CFMoto bikes bring innovation.");
    }
    @Override
    public void start() {
        System.out.println("CFMoto Bike is starting.");
    }
    @Override
    public void stop() {
        System.out.println("CFMoto Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("CFMoto Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("CFMoto Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("CFMoto Bike is honking");
    }
}

