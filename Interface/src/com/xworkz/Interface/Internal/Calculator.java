package com.xworkz.Interface.Internal;

public interface Calculator {
    public abstract void add();
    public abstract void subtract();
    public abstract void multiply();
    default void divide() {
        System.out.println("Default divide method: performing division.");
    }
}
