package com.xworkz.Interface.Internal;

public interface WaterPurifier {
    public abstract void purify();
    public abstract void refillTank();
    public abstract void alertForMaintenance();
    default void clean() {
        System.out.println(" running the clean method");
    }
}
