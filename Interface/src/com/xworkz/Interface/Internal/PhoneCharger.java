package com.xworkz.Interface.Internal;

public class PhoneCharger implements Charger{
    @Override
    public void plugIn() {
        System.out.println("running the plugIn method");
    }

    @Override
    public void chargeDevice() {
        System.out.println("running the chargeDevice method");
    }

    @Override
    public void unplug() {
        System.out.println("running the unplug method");
    }
}
