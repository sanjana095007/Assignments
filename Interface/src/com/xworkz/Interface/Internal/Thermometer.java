package com.xworkz.Interface.Internal;

public interface Thermometer {
    public abstract void measureTemperature();
    public abstract void showReading();
    public abstract void reset();
    default void cleaning() {
        System.out.println("running the cleaning method");
    }
}
