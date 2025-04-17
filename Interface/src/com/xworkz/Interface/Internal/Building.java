package com.xworkz.Interface.Internal;

public class Building implements Elevator{
    @Override
    public void goUp() {
        System.out.println("running the go Up method");
    }

    @Override
    public void goDown() {
        System.out.println("running the go Down method");
    }

    @Override
    public void openDoor() {
        System.out.println("running the open Door method");
    }
}
