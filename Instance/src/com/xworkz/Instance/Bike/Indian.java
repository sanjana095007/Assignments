package com.xworkz.Instance.Bike;

public class Indian extends Bikes {
    public void ride() {

        System.out.println("Indian bikes are perfect for cruising");
    }
    @Override
    public void start() {
        System.out.println("Indian Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("Indian Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Indian Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Indian Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Indian Bike is honking");
    }
}
