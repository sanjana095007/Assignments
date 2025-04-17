package com.xworkz.Interface.Internal;

public interface Diamond {
    public abstract void mine();
    public abstract void cut();
    public abstract void polish();
    default void displayQuality() {
        System.out.println("Default displayQuality method");
    }
}
