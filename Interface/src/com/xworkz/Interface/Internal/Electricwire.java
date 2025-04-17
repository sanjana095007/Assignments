package com.xworkz.Interface.Internal;

public class Electricwire implements  Wire{
    @Override
    public void connects() {
        System.out.println("running the connect method");
    }

    @Override
    public void transmit() {
        System.out.println("running the transmit method");
    }

    @Override
    public void insulate() {
        System.out.println("running the insulate method");
    }
}
