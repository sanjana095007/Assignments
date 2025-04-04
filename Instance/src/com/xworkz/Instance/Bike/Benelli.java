package com.xworkz.Instance.Bike;

public class Benelli extends Bikes {
    public void ride() {

        System.out.println("Benelli bikes offer a unique ride experience");
    }
    @Override
    public void start() {
        System.out.println("Benelli Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("Benelli Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Benelli Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Benelli Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Benelli Bike is honking");
    }
}
