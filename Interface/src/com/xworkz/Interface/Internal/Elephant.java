package com.xworkz.Interface.Internal;

public interface Elephant {
    public abstract void trumpet();
    public abstract void carryLoad();
    public abstract void sprayWater();
    default void displaySize() {
        System.out.println("Default displaySize method: Elephants are large and heavy animals.");
    }
}
