package com.xworkz.Interface.Internal;

public class SteamIron implements Iron{
    @Override
    public void rust() {
        System.out.println("running the rust method");
    }

    @Override
    public void forge() {
        System.out.println("running the forge method");
    }

    @Override
    public void weld() {
        System.out.println("running the weld method");
    }
}
