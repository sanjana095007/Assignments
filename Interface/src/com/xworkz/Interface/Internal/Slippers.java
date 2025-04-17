package com.xworkz.Interface.Internal;

public interface Slippers {
    public abstract void wear();
    public abstract void remove();
    public abstract void clean();
    default void checkFit() {
        System.out.println("Checking if the slippers fit properly...");
    }
}
