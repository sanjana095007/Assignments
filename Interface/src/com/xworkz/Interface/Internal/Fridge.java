package com.xworkz.Interface.Internal;

public interface Fridge {
    public abstract void cool();
    public abstract void defrost();
    public abstract void storeFood();
    default void checkTemperature() {
        System.out.println("The fridge temperature is 4°C.");
    }
}

