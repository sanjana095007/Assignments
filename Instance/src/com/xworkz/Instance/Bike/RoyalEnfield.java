package com.xworkz.Instance.Bike;


public class RoyalEnfield extends Bikes {
    public void ride() {

        System.out.println("Royal Enfield is built like a gun.");
    }
    @Override
    public void start() {
        System.out.println("RoyalEnfield Bike is starting ");
    }
    @Override
    public void stop() {
        System.out.println("RoyalEnfield Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("RoyalEnfield Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("RoyalEnfield Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("RoyalEnfield Bike is honking");
    }
}
