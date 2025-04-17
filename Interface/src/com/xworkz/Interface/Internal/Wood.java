package com.xworkz.Interface.Internal;

public interface Wood {
    public abstract void cut();
    public abstract void polish();
    public abstract void burn();
    default void displayInfo() {
        System.out.println("This is a piece of wood ready for processing.");
    }
}
