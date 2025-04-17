package com.xworkz.Interface.Internal;

public interface Fan {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void adjustSpeed();
    default void showType() {
        System.out.println("Default showType method: This is a ceiling fan.");
    }
}
