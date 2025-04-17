package com.xworkz.Interface.Internal;

public interface Silver {
    public abstract void melt();
    public abstract void mold();
    public abstract void shine();
    default void Purity() {
        System.out.println("Checking the purity of the silver...");
    }
}
