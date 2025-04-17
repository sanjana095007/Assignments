package com.xworkz.Interface.Internal;

public interface SolarPanel {
    public abstract void absorb();
    public abstract void convert();
    public abstract void store();
    default void maintain() {
        System.out.println("Maintaining the solar panel system...");
    }
}
