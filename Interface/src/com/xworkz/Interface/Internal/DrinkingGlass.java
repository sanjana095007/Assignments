package com.xworkz.Interface.Internal;

public class DrinkingGlass implements Glass{
    @Override
    public void breaks() {
        System.out.println("running the breaks method");
    }

    @Override
    public void reflect() {
        System.out.println("running the reflect method");
    }

    @Override
    public void mold() {
        System.out.println("running the mold method");
    }
}
