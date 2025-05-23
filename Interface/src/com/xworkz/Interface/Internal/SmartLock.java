package com.xworkz.Interface.Internal;

public interface SmartLock {
    public abstract void unlock();
    public abstract void lock();
    public abstract void breakin();
    default void resetSecurity() {
        System.out.println("Resetting the security system...");
    }
}
