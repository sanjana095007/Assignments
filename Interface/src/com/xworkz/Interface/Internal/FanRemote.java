package com.xworkz.Interface.Internal;

public interface FanRemote {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void changeSpeed();
    default void showRemoteType() {
        System.out.println("Default showRemoteType method: This is a basic fan remote.");
    }
}
