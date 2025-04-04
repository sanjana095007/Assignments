package com.xworkz.Instance.Bike;

public class BMW extends Bikes {
    public void ride() {

        System.out.println("BMW bikes offer luxury and power.");
    }
    @Override
    public void start() {
        System.out.println("BMW Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("BMW Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("BMW Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("BMW Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("BMW Bike is honking");
    }
}
