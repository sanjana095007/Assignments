package com.xworkz.Interface.Internal;

public interface Gold {
    public abstract void melt();
    public abstract void shape();
    public abstract void polish();
    default void refine() {
        System.out.println("The gold is being refined.");
    }
}
