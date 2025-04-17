package com.xworkz.Interface.Internal;

public interface Wire {
    public abstract void connects();
    public abstract void transmit();
    public abstract void insulate();
    default void Length() {
        System.out.println(" running length method");
    }
}
