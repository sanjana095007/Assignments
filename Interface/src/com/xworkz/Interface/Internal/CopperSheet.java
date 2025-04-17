package com.xworkz.Interface.Internal;

public class CopperSheet implements Copper{
    @Override
    public void conduct() {
        System.out.println("running the conduct method");
    }

    @Override
    public void oxidize() {
        System.out.println("running the oxidize method");
    }

    @Override
    public void recycle() {
        System.out.println("running the recycle method");
    }

    @Override
    public void checkPurity() {
        System.out.println("running the checkPurity method");
    }
}
