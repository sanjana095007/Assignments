package com.xworkz.Instance.Bike;


public class Bajaj extends Bikes {
    public void ride() {

        System.out.println("Bajaj is efficient and powerful.");
    }
    @Override
    public void start() {
        System.out.println("Bajaj Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("Bajaj Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Bajaj Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Bajaj Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Bajaj Bike is honking");
    }
}
