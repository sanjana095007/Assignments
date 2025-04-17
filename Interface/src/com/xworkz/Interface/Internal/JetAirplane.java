package com.xworkz.Interface.Internal;

public class JetAirplane implements Airplane{
    @Override
    public void takeOff() {
        System.out.println("running the takeOff method");
    }

    @Override
    public void land() {
        System.out.println("running the fly method");
    }

    @Override
    public void fly() {
        System.out.println("running the land method");
    }

    @Override
    public void model() {
        System.out.println("running the model method");
    }
}
