package com.xworkz.Interface.Internal;

public interface Flashlight {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void changeBattery();
    default void showBatteryStatus() {
        System.out.println("The battery is 80% charged.");
    }
}
