package com.xworkz.Interface.Internal;

public class SplitAC implements AC{
    @Override
    public void cool() {
        System.out.println("running the cool method");
    }

    @Override
    public void setTemperature() {
        System.out.println("running the setTemperature method");
    }

    @Override
    public void swing() {
        System.out.println("running the swing method");
    }

    @Override
    public void brand() {
        System.out.println("running the brand method");
    }
}
