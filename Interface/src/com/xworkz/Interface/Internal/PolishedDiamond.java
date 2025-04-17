package com.xworkz.Interface.Internal;

public class PolishedDiamond implements Diamond {
    @Override
    public void mine() {
        System.out.println("running the mine method");
    }

    @Override
    public void cut() {
        System.out.println("running the cut method");
    }

    @Override
    public void polish() {
        System.out.println("running the polish method");
    }
}
