package com.xworkz.Interface.Internal;

public interface WashingMachine {
    public abstract void wash();
    public abstract void rinse();
    public abstract void spin();
    default void speed() {
        System.out.println("Running the speed method");
    }
}
