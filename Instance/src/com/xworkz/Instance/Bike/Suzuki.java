package com.xworkz.Instance.Bike;

public class Suzuki extends Bikes {
    public void ride() {

        System.out.println("Suzuki is cruising on the road.");
    }
    @Override
    public void start() {
        System.out.println("Suzuki Bike is starting");
    }
    @Override
    public void stop() {
        System.out.println("Suzuki Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Suzuki Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Suzuki Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Suzuki Bike is honking");
    }
}
