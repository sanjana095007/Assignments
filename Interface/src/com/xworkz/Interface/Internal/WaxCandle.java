package com.xworkz.Interface.Internal;

public class WaxCandle implements Candle {
    @Override
    public void light() {
        System.out.println("running the light method");
    }

    @Override
    public void melt() {
        System.out.println("running the melt method");
    }

    @Override
    public void extinguish() {
        System.out.println("running the extinguish method");
    }

    @Override
    public void smell() {
        System.out.println("running the smell method");
    }
}
