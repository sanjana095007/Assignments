package com.xworkz.Instance.Bike;

public class Yamaha extends Bikes {
    public void ride() {

        System.out.println("Yamaha is racing on the highway.");
    }
    @Override
    public void start() {
        System.out.println("Yamaha Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("Yamaha Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Yamaha Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Yamaha Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Yamaha Bike is honking");
    }
}
