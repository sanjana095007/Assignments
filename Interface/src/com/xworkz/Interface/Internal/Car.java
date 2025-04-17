package com.xworkz.Interface.Internal;

public interface Car {
    public abstract void startEngine();
    public abstract void drive();
    public abstract void stop();
    default void honk() {
        System.out.println("Default honk method: Honking the car horn.");
    }
}
