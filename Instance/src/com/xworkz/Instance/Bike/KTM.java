package com.xworkz.Instance.Bike;
public class KTM extends Bikes {
public void ride() {

    System.out.println("KTM is tearing up the streets.");
}
    @Override
    public void start() {
        System.out.println("KTM Bike is starting");
    }
    @Override
    public void stop() {
        System.out.println("KTM Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("KTM Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("KTM Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("KTM Bike is honking");
    }
}