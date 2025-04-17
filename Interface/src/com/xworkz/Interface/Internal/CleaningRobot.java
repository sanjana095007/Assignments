package com.xworkz.Interface.Internal;

public class CleaningRobot implements Robot{
    @Override
    public void walk() {
        System.out.println("running the walk method");
    }

    @Override
    public void talk() {
        System.out.println("running the talk method");
    }

    @Override
    public void performTask() {
        System.out.println("running the performTask method");
    }

    @Override
    public void recharge() {
        System.out.println("running the recharge method");

    }
}
