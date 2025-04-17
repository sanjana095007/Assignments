package com.xworkz.Interface.Internal;

public interface Airplane {
    public abstract void takeOff();
    public abstract void land();
    public abstract void fly();
    default void model() {
        System.out.println("Default Airplane model is Boeing 737");
    }
}
