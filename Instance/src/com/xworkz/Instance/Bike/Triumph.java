package com.xworkz.Instance.Bike;

public class Triumph extends Bikes {
    public void ride() {

        System.out.println("Triumph is an adventure machine.");
    }
    @Override
    public void start() {
        System.out.println("Triumph Bike is starting");
    }
    @Override
    public void stop() {
        System.out.println("Triumph Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Triumph Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Triumph Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Triumph Bike is honking");
    }
}
