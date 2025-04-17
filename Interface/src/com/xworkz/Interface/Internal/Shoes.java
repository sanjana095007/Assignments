package com.xworkz.Interface.Internal;

public interface Shoes {
    public abstract void laceUp();
    public abstract void walk();
    public abstract void polish();
    default void Comfort() {
        System.out.println("Checking the comfort level of the shoes...");
    }
}
