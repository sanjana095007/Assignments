package com.xworkz.Instance.Bike;

public class Hero extends Bikes {
    public void ride() {

        System.out.println("Hero bikes are common in India.");
    }
    @Override
    public void start() {
        System.out.println("Hero Bike is starting");
    }
    @Override
    public void stop() {
        System.out.println("Hero Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Hero Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Hero Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Hero Bike is honking");
    }
}
