package com.xworkz.Interface.Internal;

public interface Bird {
    public abstract void fly();
    public abstract void chirp();
    public abstract void layEggs();
    default void habitat() {
        System.out.println("Most birds live in nests built on trees.");
    }
}
