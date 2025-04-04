package com.xworkz.Instance.Bike;

public class HarleyDavidson extends Bikes {
    public void ride() {

        System.out.println("Harley Davidson is an iconic cruiser.");
    }
    @Override
    public void start() {
        System.out.println("HarleyDavidson Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("HarleyDavidson Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("HarleyDavidson Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("HarleyDavidson Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("HarleyDavidson Bike is honking");
    }
}
