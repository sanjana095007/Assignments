package com.xworkz.Interface.Internal;

public class OfficeChair implements Chair{
    @Override
    public void sit() {
        System.out.println("running the sit method");
    }

    @Override
    public void move() {
        System.out.println("running the move method");
    }

    @Override
    public void fold() {
        System.out.println("running the fold method");
    }
}
