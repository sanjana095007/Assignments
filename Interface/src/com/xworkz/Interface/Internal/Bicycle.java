package com.xworkz.Interface.Internal;

public interface Bicycle {
    public abstract void pedal();
    public abstract void brake();
    public abstract void ringBell();
    default void typeOfBicycle() {
        System.out.println("Default Bicycle type is Mountain Bike");
    }
}
