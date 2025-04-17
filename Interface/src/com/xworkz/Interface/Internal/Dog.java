package com.xworkz.Interface.Internal;

public interface Dog {
    public abstract void bark();
    public abstract void fetch();
    public abstract void wagTail();
    default void displayBehavior() {
        System.out.println("Default displayBehavior method.");
    }
}
