package com.xworkz.Interface.Internal;

public interface Laptop {
    public abstract void boot();
    public abstract void shutdown();
    public abstract void runProgram();
    default void BatteryStatus() {
        System.out.println("Displaying battery status: 75% remaining.");
    }
}