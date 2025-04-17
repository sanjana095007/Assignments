package com.xworkz.Interface.Internal;

public interface Whiteboard {
    public abstract void write();
    public abstract void erase();
    public abstract void clean();
    default void display() {
        System.out.println("The whiteboard is clean and ready to use.");
    }
}
