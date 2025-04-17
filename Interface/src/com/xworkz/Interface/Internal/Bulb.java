package com.xworkz.Interface.Internal;

public interface Bulb {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void changeColor();
    default void powerStatus() {
        System.out.println("The bulb is powered on.");
    }
}
