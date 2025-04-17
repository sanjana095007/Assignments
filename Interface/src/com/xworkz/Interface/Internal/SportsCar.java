package com.xworkz.Interface.Internal;

public class SportsCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("running the start method");
    }

    @Override
    public void drive() {
        System.out.println("running the drive method");
    }

    @Override
    public void stop() {
        System.out.println("running the stop method");
    }

    @Override
    public void honk() {
        System.out.println("running the honk method");
    }
}
