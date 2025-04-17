package com.xworkz.Interface.Internal;

public interface Microwave {
    public abstract void heat();
    public abstract void defrost();
    public abstract void cook();
    default void Ready() {
        System.out.println("Running ready method");
    }
}
