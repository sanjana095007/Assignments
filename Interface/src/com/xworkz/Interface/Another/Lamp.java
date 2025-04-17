package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.Bulb;
import com.xworkz.Interface.Internal.Light;
import com.xworkz.Interface.Internal.MobileApp;

public class Lamp implements Bulb, MobileApp, Light {
    @Override
    public void turnOn() {
        System.out.println("running the turnOn method in SmartLamp ");
    }

    @Override
    public void turnOff() {
        System.out.println("running the turnOff method in SmartLamp ");
    }

    @Override
    public void dim() {

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
