package com.xworkz.Interface.Internal;

public interface CoffeeMachine {
    public abstract void brew();
    public abstract void addMilk();
    public abstract void clean();
    default void WaterLevel() {
        System.out.println("Default WaterLevel method");
    }
}
