package com.xworkz.Interface.Internal;

public class SteelRod implements Steel {
    @Override
    public void manufacture() {
        System.out.println("running the manufacture method");
    }

    @Override
    public void testStrength() {
        System.out.println("running the test Strength method");
    }

    @Override
    public void shape() {
        System.out.println("running the shape method");
    }
}
