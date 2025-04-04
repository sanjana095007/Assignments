package com.xworkz.Instance.Bike;

public class GasGas extends Bikes {
    public void ride() {

        System.out.println("GasGas is perfect for dirt biking.");
    }
    @Override
    public void start() {
        System.out.println("GasGas Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("GasGas Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("GasGas Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("GasGas Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("GasGas Bike is honking");
    }
}
