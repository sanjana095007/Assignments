package com.xworkz.Interface.Internal;

public class ElectricOven implements Oven{
    @Override
    public void bake() {
        System.out.println("running the bake method");
    }

    @Override
    public void grill() {
        System.out.println("running the grill method");
    }

    @Override
    public void preheat() {
        System.out.println("running the preheat method");
    }

    @Override
    public void Boil() {
        System.out.println("running the Boil method");
    }
}
