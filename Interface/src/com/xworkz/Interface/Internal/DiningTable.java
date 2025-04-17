package com.xworkz.Interface.Internal;

public class DiningTable implements Table {


    @Override
    public void placeItem() {
        System.out.println("running the placeItems method");
    }

    @Override
    public void clean() {
        System.out.println("running the clean method");
    }

    @Override
    public void fold() {
        System.out.println("running the fold method");
    }
}
