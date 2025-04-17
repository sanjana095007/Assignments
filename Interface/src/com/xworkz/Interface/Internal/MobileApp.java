package com.xworkz.Interface.Internal;

public interface MobileApp {
    public abstract void openApp();
    public abstract void performAction();
    public abstract void closeApp();
    default void Hang() {
        System.out.println("Running hung app method.");
    }
}
