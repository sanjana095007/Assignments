package com.xworkz.Interface.Internal;

public class Magneticboard implements Whiteboard{
    @Override
    public void write() {
        System.out.println("running the write method");
    }

    @Override
    public void erase() {
        System.out.println("running the erase method");
    }

    @Override
    public void clean() {
        System.out.println("running the clean method");
    }

    @Override
    public void display() {
        System.out.println("running the display method");
    }
}
