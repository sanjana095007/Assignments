package com.xworkz.Interface.Internal;

public class RubberSlippers implements Slippers{
    @Override
    public void wear() {
        System.out.println("running the wear method");
    }

    @Override
    public void remove() {
        System.out.println("running the remove method");
    }

    @Override
    public void clean() {
        System.out.println("running the clean method");
    }
}
