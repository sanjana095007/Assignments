package com.xworkz.Interface.Internal;

public interface Iron {
    public abstract void rust();
    public abstract void forge();
    public abstract void weld();
    default void polish() {
        System.out.println("The iron is being polished.");
    }
}
