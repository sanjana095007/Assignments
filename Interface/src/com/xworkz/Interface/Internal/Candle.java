package com.xworkz.Interface.Internal;

public interface Candle {
    public abstract void light();
    public abstract void melt();
    public abstract void extinguish();
    default void smell() {
        System.out.println("Default smell method: releasing a pleasant fragrance.");
    }
}
