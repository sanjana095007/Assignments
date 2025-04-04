package com.xworkz.Instance.Bike;

public class MVAgusta extends Bikes{
    public void ride() {

        System.out.println("MV Agusta is pure Italian performance.");
    }
    @Override
    public void start() {
        System.out.println("MVAgusta Bike is starting");
    }
    @Override
    public void stop() {
        System.out.println("MVAgusta Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("MVAgusta Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("MVAgusta Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("MVAgusta Bike is honking");
    }
}

