package com.xworkz.Interface.Internal;

public class WritingPen implements Pen {


    @Override
    public void write() {
        System.out.println("running the write method");
    }

    @Override
    public void refill() {
        System.out.println("running the refill method");
    }

    @Override
    public void cap() {
        System.out.println("running the cap method");
    }

    @Override
    public void InkLevel() {
        System.out.println("running the InkLevel method");
    }
}
