package com.xworkz.Instance.Bike;

public class Ducati extends Bikes {
    public void ride() {

        System.out.println("Ducati is delivering a premium ride experience.");
    }
    @Override
    public void start() {
        System.out.println("Ducati Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("Ducati Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Ducati Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Ducati Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Ducati Bike is honking");
    }
}
