package com.xworkz.Interface.Internal;

public interface Robot {
    public abstract void walk();
    public abstract void talk();
    public abstract void performTask();
    default void recharge() {
        System.out.println("Recharging the robot...");
    }
}
