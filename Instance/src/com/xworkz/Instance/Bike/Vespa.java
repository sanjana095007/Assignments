package com.xworkz.Instance.Bike;

public class Vespa extends Bikes {
    public void ride() {

        System.out.println("Vespa scooters are stylish and fun.");
    }
    @Override
    public void start() {
        System.out.println("Vespa Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("Vespa Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Vespa Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Vespa Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Vespa Bike is honking");
    }
}
