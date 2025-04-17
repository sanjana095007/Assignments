package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Fridge;
import com.xworkz.Interface.Internal.SmartLock;

public class SmartFridge implements Fridge, SmartLock {
    @Override
    public void cool() {
        System.out.println("running the cool method in SmartFridge ");
    }

    @Override
    public void defrost() {
        System.out.println("running the defrost method in SmartFridge ");
    }

    @Override
    public void storeFood() {
        System.out.println("running the storeFood method in SmartFridge ");
    }

    @Override
    public void unlock() {
        System.out.println("running the unlock method in SmartFridge ");
    }

    @Override
    public void lock() {
        System.out.println("running the lock method in SmartFridge ");
    }

    @Override
    public void breakin() {
        System.out.println("running the breakin method in ScreenTouch ");
    }
}
