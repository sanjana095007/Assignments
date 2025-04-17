package com.xworkz.Interface.Internal;

public interface Elevator {
    public abstract void goUp();
    public abstract void goDown();
    public abstract void openDoor();
    default void displayCapacity() {
        System.out.println("Default displayCapacity method: The elevator can carry a maximum of 10 passengers.");
    }
}
