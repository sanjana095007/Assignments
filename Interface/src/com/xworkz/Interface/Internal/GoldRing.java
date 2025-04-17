package com.xworkz.Interface.Internal;

public class GoldRing implements Gold{
    @Override
    public void melt() {
        System.out.println("running the melt method");
    }

    @Override
    public void shape() {
        System.out.println("running the shape method");
    }

    @Override
    public void polish() {
        System.out.println("running the polish method");
    }

    @Override
    public void refine() {
        System.out.println("running the refine method");
    }
}
