package com.xworkz.Interface.Internal;

public interface Bed {
    public abstract void sleepOn();
    public abstract void makeBed();
    public abstract void foldBlanket();
    default void bedType() {
        System.out.println("Default bed type is Queen Size");
    }
}
