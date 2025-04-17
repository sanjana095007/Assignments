package com.xworkz.Interface.Internal;

public interface Printer {
    public abstract void print();
    public abstract void scan();
    public abstract void copy();
    default void InkLevel() {
        System.out.println("Checking the ink level of the printer...");
    }
}
