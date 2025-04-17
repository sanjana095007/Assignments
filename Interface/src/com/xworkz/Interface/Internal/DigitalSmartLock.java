package com.xworkz.Interface.Internal;

public class DigitalSmartLock implements SmartLock{
    @Override
    public void unlock() {
        System.out.println("running the unlock method");
    }

    @Override
    public void lock() {
        System.out.println("running the lock method");
    }

    @Override
    public void breakin() {
        System.out.println("running the breakin method");
    }
}
