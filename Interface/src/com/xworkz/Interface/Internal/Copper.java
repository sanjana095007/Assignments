package com.xworkz.Interface.Internal;

public interface Copper {
    public abstract void conduct();
    public abstract void oxidize();
    public abstract void recycle();
    default void checkPurity() {
        System.out.println("Default checkPurity method");
    }
}
