package com.xworkz.Interface.Internal;

public interface Lift {
    public abstract void goToFloor();
    public abstract void open();
    public abstract void close();
    default void display() {
        System.out.println("The lift is ready to use.");
    }
}
