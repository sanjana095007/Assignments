package com.xworkz.Interface.Internal;

public interface Table {
    public abstract void placeItem();
    public abstract void clean();
    public abstract void fold();
    default void describe() {
        System.out.println("This is a table that can hold items, be cleaned, and folded.");
    }
}
