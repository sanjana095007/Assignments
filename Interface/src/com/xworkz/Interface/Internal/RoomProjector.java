package com.xworkz.Interface.Internal;

public class RoomProjector implements Projector{
    @Override
    public void powerOn() {
        System.out.println("running the powerOn method");
    }

    @Override
    public void display() {
        System.out.println("running the display method");
    }

    @Override
    public void focus() {
        System.out.println("running the focus method");
    }

    @Override
    public void Lamp() {
        System.out.println("running the Lamp method");
    }
}
