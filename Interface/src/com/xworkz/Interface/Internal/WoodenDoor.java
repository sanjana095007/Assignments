package com.xworkz.Interface.Internal;

public class WoodenDoor implements Door {
    @Override
    public void open() {
        System.out.println("running the open method");
    }

    @Override
    public void close() {
        System.out.println("running the close method");
    }

    @Override
    public void lock() {
        System.out.println("running the lock method");
    }

    @Override
    public void displayStatus() {
        System.out.println("running the displayStatus method");
    }
}
