package com.xworkz.Interface.Internal;

public interface Light {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void dim();
    default void Bright() {
        System.out.println("Running the Bright method");
    }
}
