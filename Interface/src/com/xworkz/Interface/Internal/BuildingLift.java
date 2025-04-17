package com.xworkz.Interface.Internal;

public class BuildingLift implements Lift{
    @Override
    public void goToFloor() {
        System.out.println("running the goToFloor method");
    }

    @Override
    public void open() {
        System.out.println("running the open method");
    }

    @Override
    public void close() {
        System.out.println("running the close method");
    }

    @Override
    public void display() {
        System.out.println("running the display method");
    }
}
