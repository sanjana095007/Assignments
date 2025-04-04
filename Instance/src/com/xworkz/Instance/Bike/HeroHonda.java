package com.xworkz.Instance.Bike;

public class HeroHonda extends Bikes {

    public void ride() {

        System.out.println("Hero Honda is riding smoothly");
    }
    @Override
    public void start() {
        System.out.println("HeroHonda Bike is starting");
    }
    @Override
    public void stop() {
        System.out.println("HeroHonda Bike is stopping");
    }
    @Override
    public void accelerate() {
        System.out.println("HeroHonda Bike is accelerating");
    }
    @Override
    public void brake() {
        System.out.println("HeroHonda Bike is applying brakes");
    }
    @Override
    public void honk() {
        System.out.println("HeroHonda Bike is honking");
    }
}
