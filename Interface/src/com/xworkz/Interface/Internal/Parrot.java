package com.xworkz.Interface.Internal;

public class Parrot implements Bird{
    @Override
    public void fly() {
        System.out.println("running the fly method");
    }

    @Override
    public void chirp() {
        System.out.println("running the chirp method");
    }

    @Override
    public void layEggs() {
        System.out.println("running the lay Eggs method");
    }

    @Override
    public void habitat() {
        System.out.println("running the Open method");
    }
}
