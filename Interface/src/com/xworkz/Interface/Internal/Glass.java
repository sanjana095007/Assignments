package com.xworkz.Interface.Internal;

public interface Glass {
    public abstract void breaks();
    public abstract void reflect();
    public abstract void mold();
    default void clean() {
        System.out.println("The glass is being cleaned.");
    }
}
