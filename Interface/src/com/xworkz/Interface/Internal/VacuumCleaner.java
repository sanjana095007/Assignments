package com.xworkz.Interface.Internal;

public interface VacuumCleaner {
    public abstract void startCleaning();
    public abstract void stopCleaning();
    public abstract void emptyBin();
    default void Cleaning() {
        System.out.println("The vacuum cleaner is ready for use.");
    }
}
