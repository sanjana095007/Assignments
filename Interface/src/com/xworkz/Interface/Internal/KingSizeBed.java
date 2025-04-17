package com.xworkz.Interface.Internal;

public class KingSizeBed implements Bed{
    @Override
    public void sleepOn() {
        System.out.println("running the sleepOn method");
    }

    @Override
    public void makeBed() {
        System.out.println("running the makeBed method");
    }

    @Override
    public void foldBlanket() {
        System.out.println("running the foldBlanket method");
    }

    @Override
    public void bedType() {
        System.out.println("running the bedType method");
    }
}
