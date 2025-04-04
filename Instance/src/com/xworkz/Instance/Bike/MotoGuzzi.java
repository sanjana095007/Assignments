package com.xworkz.Instance.Bike;

public class MotoGuzzi extends Bikes {
    public void ride() {

        System.out.println("Moto Guzzi is an Italian classic.");
    }
    @Override
    public void start() {
        System.out.println("MotoGuzzi Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("MotoGuzzi Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("MotoGuzzi Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("MotoGuzzi Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("MotoGuzzi Bike is honking");
    }
}
