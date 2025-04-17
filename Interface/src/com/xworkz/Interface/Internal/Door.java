package com.xworkz.Interface.Internal;

public interface Door {
    public abstract void open();
    public abstract void close();
    public abstract void lock();
    default void displayStatus() {
        System.out.println("Default displayStatus method");
    }
}
