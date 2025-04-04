package com.xworkz.Instance.Bike;

public class Aprilia extends Bikes {
    public void ride() {
        System.out.println("Aprilia offers a stylish ride");
    }
    @Override
    public void start() {
        System.out.println("Aprilia Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("Aprilia Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Aprilia Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Aprilia Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Aprilia Bike is honking");
    }
}
