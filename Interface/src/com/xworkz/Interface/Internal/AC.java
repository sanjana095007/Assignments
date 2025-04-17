package com.xworkz.Interface.Internal;

public interface AC {
    public abstract void cool();
    public abstract void setTemperature();
    public abstract void swing();
    default void brand() {
        System.out.println("Default AC brand is LG");
    }
}
