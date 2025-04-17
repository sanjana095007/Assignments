package com.xworkz.Interface.Internal;

public interface Toothbrush {
    public abstract void brush();
    public abstract void rinse();
    public abstract void dry();
    default void displayStatus() {
        System.out.println("The toothbrush is ready for use.");
    }
}
