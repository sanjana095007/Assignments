package com.xworkz.Interface.Internal;

public interface TrafficSignal {
    public abstract void turnGreen();
    public abstract void turnRed();
    public abstract void turnYellow();
    default void Traffic() {
        System.out.println("The traffic signal is operating.");
    }
}
