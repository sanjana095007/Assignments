package com.xworkz.Interface.Internal;

public interface Chair {
    public abstract void sit();
    public abstract void move();
    public abstract void fold();
    default void adjustHeight() {
        System.out.println("Running the  height of the chair.");
    }
}
