package com.xworkz.Instance.Bike;

public class Kawasaki extends Bikes {
    public void ride() {

        System.out.println("Kawasaki is zooming past traffic");
    }
    @Override
    public void start() {
        System.out.println("Kawasaki Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("Kawasaki Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Kawasaki Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Kawasaki Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Kawasaki Bike is honking");
    }
}
