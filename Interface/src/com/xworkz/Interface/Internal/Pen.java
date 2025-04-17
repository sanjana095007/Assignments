package com.xworkz.Interface.Internal;

public interface Pen {
   public abstract void write();
    public abstract void refill();
    public abstract void cap();
    default void InkLevel() {
        System.out.println("The ink level is sufficient.");
    }
}
