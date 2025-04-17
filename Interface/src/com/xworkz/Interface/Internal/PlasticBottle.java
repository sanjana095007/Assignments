package com.xworkz.Interface.Internal;

public class PlasticBottle implements Plastic{
    @Override
    public void mold() {
        System.out.println("running the mold method");
    }

    @Override
    public void recycle() {
        System.out.println("running the recycle method");
    }

    @Override
    public void melt() {
        System.out.println("running the melt method");
    }

    @Override
    public void Quality() {
        System.out.println("running the Quality method");
    }
}
