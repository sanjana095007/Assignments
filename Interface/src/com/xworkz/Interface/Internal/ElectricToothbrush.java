package com.xworkz.Interface.Internal;

public class ElectricToothbrush implements Toothbrush{
    @Override
    public void brush() {
        System.out.println("running the brush method");
    }

    @Override
    public void rinse() {
        System.out.println("running the rinse method");
    }

    @Override
    public void dry() {
        System.out.println("running the dry method");
    }

    @Override
    public void displayStatus() {
        System.out.println("running the displayStatus method");
    }
}
