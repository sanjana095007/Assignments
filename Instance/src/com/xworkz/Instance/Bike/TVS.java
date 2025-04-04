package com.xworkz.Instance.Bike;

public class TVS extends Bikes {
    public void ride() {

        System.out.println("TVS is known for reliability.");
    }
    @Override
    public void start() {
        System.out.println("TVS Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("TVS Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("TVS Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("TVS Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("TVS Bike is honking");
    }
}
