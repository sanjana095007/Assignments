package com.xworkz.Interface.Internal;

public interface AirPurifier {
    public abstract void purifyAir();
    public abstract void replaceFilter();
    public abstract void displayAirQuality();
    default void brand() {
        System.out.println("Default AirPurifier brand is Dyson");
    }
}
