package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Fridge;
import com.xworkz.Interface.Internal.MobileApp;
import com.xworkz.Interface.Internal.SmartLock;

public class SmartDoorFridge implements Fridge, SmartLock, MobileApp {
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

    @Override
    public void openApp() {
        System.out.println("running the openApp method in ScreenTouch ");

    }

    @Override
    public void performAction() {
        System.out.println("running the performAction method in ScreenTouch ");

    }

    @Override
    public void closeApp() {
        System.out.println("running the closeApp method in ScreenTouch ");

    }
}
