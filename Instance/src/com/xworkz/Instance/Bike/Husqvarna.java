package com.xworkz.Instance.Bike;

public class Husqvarna extends Bikes {
    public void ride() {
        System.out.println("Husqvarna is designed for off-road and performance");
    }
    @Override
    public void start() {
        System.out.println("Husqvarna Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("Husqvarna Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("Husqvarna Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Husqvarna Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("Husqvarna Bike is honking");
    }
}
