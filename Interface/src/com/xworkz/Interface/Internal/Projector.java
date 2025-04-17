package com.xworkz.Interface.Internal;

public interface Projector {
    public abstract void powerOn();
    public abstract void display();
    public abstract void focus();
    default void Lamp() {
        System.out.println("Checking the lamp status of the projector...");
    }
}
