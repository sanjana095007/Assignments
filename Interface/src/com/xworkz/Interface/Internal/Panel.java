package com.xworkz.Interface.Internal;

public class Panel implements SolarPanel{
    @Override
    public void absorb() {
        System.out.println("running the absorb method");
    }

    @Override
    public void convert() {
        System.out.println("running the convert method");
    }

    @Override
    public void store() {
        System.out.println("running the store method");
    }
}
