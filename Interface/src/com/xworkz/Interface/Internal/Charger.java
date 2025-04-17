package com.xworkz.Interface.Internal;

public interface Charger {
    public abstract void plugIn();
    public abstract void chargeDevice();
    public abstract void unplug();
    default void Battery() {
        System.out.println(" running  battery default method");
    }
}
