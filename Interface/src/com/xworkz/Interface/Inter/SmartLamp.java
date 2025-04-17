package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Bulb;
import com.xworkz.Interface.Internal.MobileApp;

public class SmartLamp implements Bulb, MobileApp {
    @Override
    public void turnOn() {
        System.out.println("running the turnOn method in SmartLamp ");
    }

    @Override
    public void turnOff() {
        System.out.println("running the turnOff method in SmartLamp ");
    }

    @Override
    public void changeColor() {
        System.out.println("running the changeColor method in SmartLamp ");
    }

    @Override
    public void openApp() {
        System.out.println("running the openApp method in SmartLamp ");
    }

    @Override
    public void performAction() {
        System.out.println("running the performAction method in SmartLamp ");
    }

    @Override
    public void closeApp() {
        System.out.println("running the closeApp method in SmartLamp ");
    }
}
